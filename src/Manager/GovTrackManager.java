package Manager;

import DataModel.GovTrackLegislator;
import Request.GovTrackRequest;
import Response.GovTrackJsonResponse;
import UrlBuilder.GovTrackUrlBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

import java.io.IOException;
import java.util.ArrayList;



public class GovTrackManager
{
    // GovTrack OpenStateLegislator Array
    public ArrayList<GovTrackLegislator> govTrackLegislatorLists;
    GovTrackUrlBuilder govUrl = new GovTrackUrlBuilder();
    GovTrackRequest govReqest = new GovTrackRequest();
    GovTrackJsonResponse govJson = new GovTrackJsonResponse();
    String strGovTrackURL;

    public GovTrackManager()
    {
        govTrackLegislatorLists = new ArrayList<>();

    }

    public String govTrackGetState(String inputState)
    {
        System.out.println("This is the state: " + inputState);
        return inputState;
    }

    public String govTrackBuildUrl(String inputState)
    {
        strGovTrackURL = govUrl.govTrackUrlBuilder(inputState);
        System.out.println("This is the statURL: " + strGovTrackURL);
        return strGovTrackURL;
    }

    public HttpResponse govTrackResponse(String govTrackUrl) throws Exception {

        // TODO: (CloseableHttpResponse) Change HttpResponse to closeable HTTResponse
        // Send request to OpenstateAPI
        HttpResponse responseStatus = govReqest.govTrackSendRequest(govTrackUrl);
        System.out.println("This is the responseStatus: " + responseStatus);

        // return response
        return responseStatus;

    }

    public String govTrackJson(HttpResponse govTrackResponse) throws IOException
    {
        String govTrackJsonStr = govJson.GovTrackLegislatorJson(govTrackResponse);
        return govTrackJsonStr;
    }


}
