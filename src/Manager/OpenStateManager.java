package Manager;

import DataModel.OpenStateLegislatorDetail;
import API.OpenStatesAPI;
import DataModel.OpenStateLegislator;
import Storage.OpenStateStorage;
import Request.OpenStateRequest;
import Response.OpenStateJsonResponse;
import UrlBuilder.OpenStateUrlBuilder;

import org.apache.http.*;
import org.apache.http.client.methods.CloseableHttpResponse;


import java.io.IOException;
import java.util.ArrayList;

public class OpenStateManager
{

    /**************************************** OpenStateLegislator **************************************************************/

    // Get user input
    OpenStatesAPI state = new OpenStatesAPI();

    // Build Url
    OpenStateUrlBuilder stateURL = new OpenStateUrlBuilder();

    // Send HttpRequest
    OpenStateRequest openStateRequestMain = new OpenStateRequest();

    // Parse the Json
    OpenStateJsonResponse openStateJsonMain = new OpenStateJsonResponse();

    // Store JSON
    OpenStateStorage openStateStorageMain = new OpenStateStorage();

    // Store User State
    String userState;

    // LegislatorUrl String
    String strLegislatorURL;

    /**************************************** OpenStateLegislator END **********************************************************/

    /**************************************** OpenStateLegislator Detail *******************************************************/

    // OpenStateLegislator ID
    String userLegID;

    // legislatorDetailURL string
    String strLegislatorDetailURL;

    /**************************************** OpenStateLegislator Detail *******************************************************/


    // OpenStateLegislator Array
    public ArrayList<OpenStateLegislator> openStateLegislatorArrayList;
    public ArrayList<OpenStateLegislatorDetail> openStateLegislatorDetailArrayList;



    public OpenStateManager()
    {

        openStateLegislatorArrayList = new ArrayList<>();
        openStateLegislatorDetailArrayList = new ArrayList<>();

    }

    public String openStateGetState()
    {
        // Ask user to enter two digit state
        userState = state.getState();

        // return userState
        return userState;
    }

    public String openStateBuildLegislatorStateUrl(String legislatorState)
    {
        // Send userState to legislatorURL to build URL
        strLegislatorURL = stateURL.OpenStatelegislatorUrl(legislatorState);

        //return legislatorURL
        return strLegislatorURL;
    }

    public HttpResponse openStateLegislatorResponse(String legislatorStateURL) throws Exception {

        // TODO: (CloseableHttpResponse) Change HttpResponse to closeable HTTResponse
        // Send request to OpenstateAPI
        HttpResponse responseStatus = openStateRequestMain.OpenStateSendRequest(legislatorStateURL);

        // return response
        return responseStatus;

    }

    public String openStateJson(HttpResponse urlResponse) throws IOException {

        // Need to parse the Json from the response
        String jsonStr = openStateJsonMain.OpenStatelegislatorJson(urlResponse);

        // return json String from legislator url
        return jsonStr;
    }

    public ArrayList<OpenStateLegislator> openStateFillStateLegislatorArrayList(String jsonStr) throws Exception
    {

        // TODO: (JSONDATA) Need to sort JSON data given Leg_id, first_name, last_name, id
        openStateLegislatorArrayList = openStateStorageMain.storeLegislator(jsonStr);

        // return ArrayList
        return openStateLegislatorArrayList;

    }

    public String openStateGetLegID()
    {
        // Ask user for legID
        userLegID = state.getlegID();

        // return legID
        return userLegID;
    }

    public String openStateBuildLegislatorLegIDUrl(String legID)
    {
        // Send userState to legislatorURL to build URL
        strLegislatorURL = stateURL.OpenStatelegislatorDetailUrl(legID);

        // return URL string
        return strLegislatorURL;
    }

    public CloseableHttpResponse openStateLegislatorDetailResponse(String strLegislatorDetailURL) throws Exception {

        // Get the response from the server
        CloseableHttpResponse legislatorDetailResponse = (CloseableHttpResponse) openStateRequestMain.OpenStateSendDetailRequest(strLegislatorDetailURL);

        // return HttpResponse
        return legislatorDetailResponse;
    }

    public String openStateDetailJson(HttpResponse legislatorDetailResponse) throws IOException {

        // Need to parse the Json from the response
        String legislatorDetailJsonStr = openStateJsonMain.OpenStatelegislatorDetailJson(legislatorDetailResponse);

        // return detail json str
        return legislatorDetailJsonStr;
    }

    public ArrayList<OpenStateLegislatorDetail> openStateFillStateLegislatorDetailArrayList(String legislatorDetailJsonStr) throws Exception
    {

        // Need to store the ArrayList
        openStateLegislatorDetailArrayList = openStateStorageMain.storeLegislatorDetail(legislatorDetailJsonStr);

        // Return ArrayList
        return openStateLegislatorDetailArrayList;

    }

}
