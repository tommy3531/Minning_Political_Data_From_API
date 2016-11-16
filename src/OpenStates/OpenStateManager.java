package OpenStates;

import DataModel.Legislator;
import UrlBuilder.UrlBuilder;
import User.User;
import org.apache.http.HttpResponse;
import org.openstates.data.Bill;

import java.util.ArrayList;


/**
 * Created by tommarler on 11/16/16.
 */
public class OpenStateManager {

    // Store User State
    String userState;

    // LegislatorUrl String
    String strLegislatorURL;

    // Legislator Array
    public ArrayList<Legislator> legislatorList;

    public OpenStateManager() {

        legislatorList = new ArrayList<>();

    }

    public void startOpenState() throws Exception {

        // Get user input
        User user = new User();

        // Build Url
        UrlBuilder url = new UrlBuilder();

        // Send HttpRequest
        SendOpenStateRequest sendOpenSR = new SendOpenStateRequest();

        // Parse the Json
        OpenStateJsonParser jsonOpenSR = new OpenStateJsonParser();

        // Need to store the parsed JSON
        OpenStateStorage stateStorage = new OpenStateStorage();

        // Ask user to enter two digit state
        userState = user.getState();

        // Send userState to legislatorURL to build URL
        strLegislatorURL = url.legislatorUrl(userState);
        System.out.println("This is the strLegislatorURL: " + strLegislatorURL);

        // TODO: (CloseableHttpResponse) Change HttpResponse to closeable HTTPresponse

        // Send request to OpenstateAPI
        HttpResponse responseStatus = sendOpenSR.sendLegislatorRequest(strLegislatorURL);

        // Need to parse the Json from the response
        String jsonStr = jsonOpenSR.legislatorJson(responseStatus);

        // Need to store legislatorData
        // TODO: (JSONDATA) Need to sort JSON data given Leg_id, first_name, last_name, id

        legislatorList = stateStorage.storeLegislator(jsonStr);

        System.out.println("This is the HTTP Code: " + responseStatus.getStatusLine().getStatusCode());
        System.out.println("This is the responseStatus: " + responseStatus);
        System.out.println("This is the legislatorList: " + legislatorList);

        //
    }
}
