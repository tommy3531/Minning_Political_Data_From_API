package Manager;

import DataModel.LegislatorDetail;
import User.User;
import DataModel.Legislator;
import Storage.OpenStateStorage;
import Request.OpenStateRequest;
import Parser.OpenStateJsonParser;
import Respository.OpenStateRepository;
import UrlBuilder.UrlBuilder;

import org.apache.http.*;
import java.util.ArrayList;

public class OpenStateManager
{

    /**************************************** Legislator **************************************************************/

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

    /**************************************** Legislator END **********************************************************/

    /**************************************** Legislator Detail *******************************************************/

    // Legislator ID
    String userLegID;

    // legislatorDetailURL string
    String strLegislatorDetailURL;

    /**************************************** Legislator Detail *******************************************************/


    // Legislator Array
    public ArrayList<Legislator> legislatorArrayList;
    public ArrayList<LegislatorDetail> legislatorDetailArrayList;



    public OpenStateManager()
    {

        legislatorArrayList = new ArrayList<>();
        legislatorDetailArrayList = new ArrayList<>();

    }

    public void stateLegislator() throws Exception
    {

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

        legislatorArrayList = stateStorage.storeLegislator(jsonStr);

        // Send list to repository Treat list like a database
        stateRepo.legislatorRepo(legislatorArrayList);

    }

    public void legislatorDetail() throws Exception
    {

        // Ask user for legID
        userLegID = user.getlegID();

        // Send userState to legislatorURL to build URL
        strLegislatorDetailURL = url.legislatorDetailUrl(userLegID);

        // Get the response from the server
        HttpResponse legislatorDetailResponse = sendOpenSR.sendLegislatorDetailRequest(strLegislatorDetailURL);

        // Need to parse the Json from the response
        String legislatorDetailJsonStr = jsonOpenSR.legislatorDetailJson(legislatorDetailResponse);

        // Need to store the ArrayList
        legislatorDetailArrayList = stateStorage.storeLegislatorDetail(legislatorDetailJsonStr);

        // Send list to repository Treat list like a database
        stateRepo.legislatorDetailRepo(legislatorDetailArrayList);

    }
}
