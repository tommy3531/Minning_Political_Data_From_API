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

    // Legislator Array
    public ArrayList<Legislator> legislatorList;

    public OpenStateManager() {

        legislatorList = new ArrayList<>();

    }

    public void startOpenState() throws Exception {

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

        legislatorList = stateStorage.storeLegislator(jsonStr);

        // Send list of repository
        stateRepo.startOpenStartRepo(legislatorList);

        // Loop Through list on repository
        stateRepo.legislatorItemsLoop(legislatorList);
        //JSONArray jArray = stateStorage.storeLegislator(jsonStr);

        System.out.println("This is the HTTP Code: " + responseStatus.getStatusLine().getStatusCode());
        System.out.println("This is the responseStatus: " + responseStatus);
        System.out.println("This is the legislatorList: " + legislatorList);
    }
}
