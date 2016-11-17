package Manager;

import User.User;
import DataModel.Legislator;
import Storage.OpenStateStorage;
import Request.OpenStateRequest;
import Parser.OpenStateJsonParser;
import Respository.OpenStateRepository;
import UrlBuilder.UrlBuilder;

import org.apache.http.*;
import java.util.ArrayList;

public class OpenStateManager {

    // Get user input
    User user = new User();

    // Build Url
    UrlBuilder url = new UrlBuilder();

    // Send HttpRequest
    OpenStateRequest sendOpenSR = new OpenStateRequest();

    // Parse the Json
    OpenStateJsonParser jsonOpenSR = new OpenStateJsonParser();

    // Need to store the parsed JSON
    OpenStateStorage stateStorage = new OpenStateStorage();

    // Ned to send to repository
    OpenStateRepository stateRepo = new OpenStateRepository();

    // Store User State
    String userState;

    // LegislatorUrl String
    String strLegislatorURL;

    /********************* Legislator Details ****************************/

    // Legislator ID
    String userLegID;

    // legislatorDetailURL string
    String strLegislatorDetailURL;



    // Legislator Array
    public ArrayList<Legislator> legislatorData;

    public OpenStateManager() {

        legislatorData = new ArrayList<>();

    }

    public void stateLegislator() throws Exception {

        // Ask user to enter two digit state
        userState = user.getState();

        // Send userState to legislatorURL to build URL
        strLegislatorURL = url.legislatorUrl(userState);
        System.out.println("This is the strLegislatorURL: " + strLegislatorURL);

        // TODO: (CloseableHttpResponse) Change HttpResponse to closeable HTTResponse

        // Send request to OpenstateAPI
        HttpResponse responseStatus = sendOpenSR.sendLegislatorRequest(strLegislatorURL);

        // Need to parse the Json from the response
        String jsonStr = jsonOpenSR.legislatorJson(responseStatus);

        // Need to store legislatorData
        // TODO: (JSONDATA) Need to sort JSON data given Leg_id, first_name, last_name, id
        // OpenstateManager should go to Repository becasue it has an array of Legislators

        legislatorData = stateStorage.storeLegislator(jsonStr);

        // Send list to repository
        stateRepo.legislatorRepo(legislatorData);

    }

    public void legislatorDetail(){

        // Ask user for legID
        userLegID = user.getlegID();

        // Send userState to legislatorURL to build URL
        strLegislatorDetailURL = url.legislatorDetailUrl(userLegID);

        // Print out LegID;
        System.out.println("This is your LegID: " + userLegID);

        // Print out legislatorDetailURL
        System.out.println("This the legislator Details URL: " + strLegislatorDetailURL);
    }
}
