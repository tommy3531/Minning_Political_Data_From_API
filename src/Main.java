import DataModel.*;
import Manager.FollowTheMoneyManager;
import Manager.GovTrackManager;
import Manager.OpenFECManager;
import Manager.OpenStateManager;
import Respository.FollowTheMoneyRespository;
import Respository.GovTrackRespository;
import com.esotericsoftware.yamlbeans.YamlReader;
import com.sun.org.apache.xpath.internal.Arg;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


public class Main {

    // OpenState ArrayList
    public static ArrayList<OpenStateLegislator> openStateLegislatorList;
    public static ArrayList<OpenStateLegislatorDetail> openStateLegislatorDetailList;
    public static ArrayList<FollowTheMoneyLegislator> followTheMoneyArrayList;


    // OpenFEC ArrayList
    public static ArrayList<OpenFECLegislator> openFECLegislatorList;


    public static void main(String[] args) throws Exception {
//        String legislatorState;
//        String legislatorStateURL;
//        HttpResponse openStateLegislatorResponse;
//        String jsonLegislatorURL;
//        String openStateLegID;
//        String legislatorLegIDURL;
//        CloseableHttpResponse openStateLegIDResponse;
//        String jsonLegislatorDetailURL;
//
//        OpenStateManager stateManager = new OpenStateManager();
//        // Get the legislatorState
//        legislatorState = stateManager.openStateGetState();
//
//        // Print out the state entered by user
//        System.out.println("This is the state value you entered: " + legislatorState);
//
//        // Build the legislatorState URL
//        legislatorStateURL = stateManager.openStateBuildLegislatorStateUrl(legislatorState);
//
//        // Print out the legislatorState URL
//        System.out.println("This is the legislatorStateURL: " + legislatorStateURL);
//
//        // Get the response from the legislatorStateURL
//        openStateLegislatorResponse = stateManager.openStateLegislatorResponse(legislatorStateURL);
//
//        // Print out the legislatorStateURL Response
//        System.out.println("This is the openStateLegisaltorResponse: " + openStateLegislatorResponse.getStatusLine());
//
//        // Get JSON for the legislatorURL
//        jsonLegislatorURL = stateManager.openStateJson(openStateLegislatorResponse);
//
//        // Fill the Array
//        openStateLegislatorList = stateManager.openStateFillStateLegislatorArrayList(jsonLegislatorURL);
//
//
        // Get the leg_id
//        openStateLegID = stateManager.openStateGetLegID();
//
//        // Print out the leg_id
//        System.out.println("This is the leg_id: " + openStateLegID);
//
//        // Build the URL with the leg_id
//        legislatorLegIDURL = stateManager.openStateBuildLegislatorLegIDUrl(openStateLegID);
//
//        // Print out the URL with the leg_id
//        System.out.println("This is the URL with the leg_id: " + legislatorLegIDURL);
//
//        // Get the response from the legislatorStateURL
//        openStateLegIDResponse = stateManager.openStateLegislatorDetailResponse(legislatorLegIDURL);
//
//        // Print out the response code
//        System.out.println("This is the response for the leg_id URL: " + openStateLegIDResponse.getStatusLine());
//
//        // Get JSON for the legislatorDetailURL
//        jsonLegislatorDetailURL = stateManager.openStateDetailJson(openStateLegIDResponse);
//
//        // Fill the Array
//        openStateLegislatorDetailList = stateManager.openStateFillStateLegislatorDetailArrayList(jsonLegislatorDetailURL);
//        openStateLegIDResponse.close();
/*********** OpenRespository ******************************************************************************************/
//        OpenStateRepository stateRepo = new OpenStateRepository();
//        stateRepo.getLegislatorData(openStateLegislatorList);
//        stateRepo.getLegislatorDetailData(openStateLegislatorDetailList);
//        stateRepo.getLegislatorByLegID(openStateLegislatorList, "MOL000417");
//        stateRepo.getLegislatorByLastName(openStateLegislatorList, "Wasson");
//        stateRepo.getLegislatorDetailByLegID(openStateLegislatorDetailList, "MOL000417");
/*****************  FollowTheMoney ************************************************************************************/

//        http://api.followthemoney.org/?c-t-eid=3837002&gro=d-id,c-t-id,c-t-sts,d-empl,d-occupation&APIKey=4bed8fe186974ce2df75046bb3f3f220&mode=json
//        FollowTheMoneyManager moneyManager = new FollowTheMoneyManager();
//        // Get the hash
//        HashMap followTheMoneyHash = new HashMap();
//        File file = new File("ID.txt");
//        followTheMoneyHash = (HashMap) moneyManager.hashMapForID(file);
//
//        // Get the FollowTheMoneyID from the OpenStateID
//        String followTheMoneyID = moneyManager.findFollowMoneyIDFromOpenStateID(openStateLegID);
//
//        System.out.println(followTheMoneyID);
//
//        //BuildURL
//        String followTheMoneyURL = moneyManager.followTheMoneyURL(followTheMoneyID);
//
//        System.out.println(followTheMoneyURL);
//
//        //Get the response
//        CloseableHttpResponse moneyResponse;
//        moneyResponse = moneyManager.followTheMoneyResponse(followTheMoneyURL);
//
//        System.out.println("This is from Main.java Response: " + moneyResponse);
//
//
//        // Get the json
//        String followTheMoneyJson = moneyManager.followTheMoneyJson(moneyResponse);
//
//        System.out.println("This is from Main.java: " + followTheMoneyJson);
//
//        // Fill ArrayList
//        followTheMoneyArrayList = moneyManager.followTheMoneyFillLegislatorArrayList(followTheMoneyJson);
//
//        // Close
//        moneyResponse.close();


/***************** END FollowTheMoney  *******************************************************************************/

//        // Start of FollowTheMoneyRespository
//        FollowTheMoneyRespository moneyRespository = new FollowTheMoneyRespository();
//        moneyRespository.getFollowTheMoneyLegislatorData(followTheMoneyArrayList);

//    }
//}
/***************************** GovTrack Code ***************************************************************************/
        GovTrackManager govManager = new GovTrackManager();
        GovTrackRespository govRespository = new GovTrackRespository();
        ArrayList<GovTrackLegislator> govTrackLegislatorArrayList;
        File file = new File("legislator-current.json");
        govTrackLegislatorArrayList = govManager.getGovTrackList(file);
        //govRespository.getGovTrackLegislatorData(govTrackLegislatorArrayList);
        String legid = "400050";
        govRespository.getGovTrackLegislatorDataByID(legid, govTrackLegislatorArrayList);

    }
}













// https://api.open.fec.gov/v1/candidates/?candidate_status=C&incumbent_challenge=I&per_page=20&state=mo&api_key=AVpaPd4e2VB1GLoPCOg8BSfFSpbMQQJwA7krAqsq&page=1
//OpenFECManager fecManager = new OpenFECManager();
//        String govTrackCandidate_id = "https://api.open.fec.gov/v1/candidates/?candidate_status=C&incumbent_challenge=I&per_page=20&state=mo&api_key=AVpaPd4e2VB1GLoPCOg8BSfFSpbMQQJwA7krAqsq&page=1";
//
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpGet request = new HttpGet(govTrackCandidate_id);
//        System.out.println("This is the request: " + request);
//
//        CloseableHttpResponse response = (CloseableHttpResponse) client.execute(request);
//        String json = EntityUtils.toString(response.getEntity());
//
//        JSONParser parser = new JSONParser();
//        Object obj = parser.parse(json);
//
//        JSONObject jsonObject = (JSONObject)obj;
//
//
//        if(jsonObject instanceof JSONObject)
//        {
//
//            JSONArray resultsArray = (JSONArray)jsonObject.get("results");
//
//            for(Object obj2 : resultsArray)
//            {
//                JSONObject jOb1 = (JSONObject)obj2;
//                String name         =  (String) jOb1.get("name");
//                String candidate_id = (String) jOb1.get("candidate_id");
//                String rep_state = (String) jOb1.get("rep_state");
//                String office_sought =  (String) jOb1.get("office_sought");
//                String incumbent_chanllenge =  (String) jOb1.get("incumbent_chanllenge");
//                String candidate_status =  (String) jOb1.get("candidate_status");
//                System.out.println("This is the name: " + name);
//                System.out.println("This is the state: " + candidate_id);
//                System.out.println("This is the party_full: " + office_sought + "\n");
//
//            }
//
//        }

/*********************************** OpenSecrets.org ******************************************************************/
//        String openSecretsURL = "http://www.opensecrets.org/api/?method=getLegislators&id=MO&apikey=9d63a5b896ed2d9a29c86696f4809075&output=json";
//
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpGet request = new HttpGet(openSecretsURL);
//        System.out.println("This is the request: " + request);
//
//        CloseableHttpResponse response = (CloseableHttpResponse) client.execute(request);
//        String json = EntityUtils.toString(response.getEntity());
//
//        JSONParser parser = new JSONParser();
//        Object obj = parser.parse(json);
//
//        JSONObject openSecretJSON = (JSONObject) obj;
//        JSONObject openObj = (JSONObject) openSecretJSON.get("response");
//        JSONArray a = (JSONArray)openObj.get("legislator");
//
//        for(Object obj5 : a)
//        {
//            JSONObject j = (JSONObject)obj5;
//            JSONObject jp = (JSONObject)j.get("@attributes");
//
//            String cid = (String) jp.get("cid");
//            String firstlast = (String) jp.get("firstlast");
//            String bioguide_id = (String) jp.get("bioguide_id");
//            String votesmart_id = (String) jp.get("votesmart_id");
//            String feccandid = (String) jp.get("feccandid");
//            String twitter_id = (String) jp.get("twitter_id");
//            String youtube_url = (String) jp.get("youtube_url");
//            String facebook_id = (String) jp.get("facebook_id");
//            System.out.println("This is the cid from OpenSecrets: " + cid);
//            System.out.println("This is the firstlast from OpenSecrets: " + firstlast);
//            System.out.println("This is the bioguide_id from OpenSecrets: " + bioguide_id);
//            System.out.println("This is the votesmart_id from OpenSecrets: " + votesmart_id);
//            System.out.println("This is the feccandid from OpenSecrets: " + feccandid);
//            System.out.println("This is the twitter_id from OpenSecrets: " + twitter_id);
//            System.out.println("This is the youtube_url from OpenSecrets: " + youtube_url);
//            System.out.println("This is the facebook_id from OpenSecrets: " + facebook_id);
//
//        }
        /*********************************** Follow The Money *****************************************************************/





//}
//        OpenStateRepository stateRepo = new OpenStateRepository();
//        stateRepo.getLegislatorData(openStateLegislatorList);
//        stateRepo.getLegislatorDetailData(openStateLegislatorDetailList);
//        stateRepo.getLegislatorByLegID(openStateLegislatorList, "MOL000417");
//        stateRepo.getLegislatorByLastName(openStateLegislatorList, "Wasson");
//        stateRepo.getLegislatorDetailByLegID(openStateLegislatorDetailList, "MOL000417");



//        String value = (String) hm.get(openStateLegID);
//        String json = "followthemoney.json";
//        String RealURL = "http://api.followthemoney.org/?c-t-eid=3837002&gro=d-id,c-t-id,c-t-sts,d-empl,d-occupation&APIKey=4bed8fe186974ce2df75046bb3f3f220&mode=json";
//
//
//
//
//    }
//}
//        String openSecretsURL = "http://www.govtrack.us/api/v2/role?current=true&state=MO";
//
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpGet request = new HttpGet(openSecretsURL);
//        System.out.println("This is the request: " + request);
//
//        CloseableHttpResponse response = (CloseableHttpResponse) client.execute(request);
//        String json = EntityUtils.toString(response.getEntity());
//        System.out.println(json);

//    }
//
//}






//        GovTrackManager govManagerMain = new GovTrackManager();
//        GovTrackUrlBuilder govTrackUrlBuilder = new GovTrackUrlBuilder();
//        GovTrackRequest govTrackRequestData = new GovTrackRequest();
//
//
//
//        String govTrackStateString = govManagerMain.govTrackGetState(legislatorState);
//        String govTrackURL = govTrackUrlBuilder.govTrackUrlBuilder(govTrackStateString);
//        HttpResponse govTrackResponse = govTrackRequestData.govTrackSendRequest(govTrackURL);

//        String govTrackStateString = govManagerMain.govTrackGetState(legislatorState);
//        System.out.println("This is the govTrack State string: " + govTrackStateString);
//        String govTrackURL = govManagerMain.govTrackBuildUrl(govTrackStateString);
//        System.out.println("This is the govTrack URL stirng: " + govTrackURL);
//        HttpResponse govTrackResponse = govManagerMain.govTrackResponse(govTrackURL);
//        String govTrackJson = govManagerMain.govTrackJson(govTrackResponse);
//        System.out.println("This is the govTrack URL response: " + govTrackResponse);
//        openStateLegIDResponse = stateManager.openStateLegislatorDetailResponse(legislatorLegIDURL);



