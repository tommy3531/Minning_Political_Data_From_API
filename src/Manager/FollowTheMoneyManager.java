package Manager;

import DataModel.FollowTheMoneyLegislator;
import DataModel.OpenStateLegislator;
import Request.FollowTheMoneyRequest;
import Response.FollowTheMoneyResponse;
import Storage.FollowTheMoneyStorage;
import UrlBuilder.FollowTheMoneyUrlBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tommarler on 11/21/16.
 */
public class FollowTheMoneyManager {

    // Build FollowTheMoneyURL
    FollowTheMoneyUrlBuilder moneyURL = new FollowTheMoneyUrlBuilder();

    // Send FollowTheMoneyURL HttpRequest
    FollowTheMoneyRequest moneyRequest = new FollowTheMoneyRequest();

    // Parse the JSON from the FollowTHeMoneyURL
    FollowTheMoneyResponse moneyResponse = new FollowTheMoneyResponse();

    // Store JSON
    FollowTheMoneyStorage moneyStorage = new FollowTheMoneyStorage();

    // FollowTheMoney ArrayList
    ArrayList<FollowTheMoneyLegislator> followTheMoneyArrayList;
    HashMap hm = new HashMap();

    String strFollowTheMoneyURL;

    public FollowTheMoneyManager()
    {
        followTheMoneyArrayList = new ArrayList<>();
    }

    public Map<String, String> hashMapForID(File id)
    {
//        File file = new File(String.valueOf(id));
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(id));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                hm.put(country[0], country[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return hm;

    }

    public String findFollowMoneyIDFromOpenStateID(String openStateLegID)
    {
        String value = (String) hm.get(openStateLegID);
        return value;
    }

    public String followTheMoneyURL (String openStateLegID)
    {
        strFollowTheMoneyURL = moneyURL.followTheMoneylegislatorUrl(openStateLegID);
        return strFollowTheMoneyURL;
    }

    public CloseableHttpResponse followTheMoneyResponse(String strFollowTheMoneyURL) throws Exception {

        // Get the response from the server
        CloseableHttpResponse followTheMoneyResponse = (CloseableHttpResponse) moneyRequest.followTheMoneyRequest(strFollowTheMoneyURL);

        // return HttpResponse
        return followTheMoneyResponse;
    }

    public String followTheMoneyJson(HttpResponse followTheMoneyResponse) throws IOException {

        // Need to parse the Json from the response
        String followTheMoneyJsonStr = moneyResponse.followTheMoneyJson(followTheMoneyResponse);

        // return detail json str
        return followTheMoneyJsonStr;
    }

    public ArrayList<FollowTheMoneyLegislator> followTheMoneyFillLegislatorArrayList(String jsonStr) throws Exception
    {

        // TODO: (JSONDATA) Need to sort JSON data given Leg_id, first_name, last_name, id
        followTheMoneyArrayList = moneyStorage.storeFollowTheMoneyLegislator(jsonStr);

        // return ArrayList
        return followTheMoneyArrayList;

    }
}
