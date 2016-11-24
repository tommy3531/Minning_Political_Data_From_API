package Manager;

import DataModel.GovTrackLegislator;
import Request.GovTrackRequest;
import Response.GovTrackJsonResponse;
import Storage.GovTrackStorage;
import UrlBuilder.GovTrackUrlBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class GovTrackManager
{
    // GovTrack OpenStateLegislator Array
    public ArrayList<GovTrackLegislator> govTrackLegislatorLists;
    GovTrackStorage govStorage = new GovTrackStorage();
    String strGovTrackURL;
    HashMap govHash = new HashMap();

    public GovTrackManager()
    {
        govTrackLegislatorLists = new ArrayList<>();

    }



    public ArrayList<GovTrackLegislator> getGovTrackList(File govList) throws IOException, ParseException
    {
        govTrackLegislatorLists = govStorage.storeGovTrackLegislator(govList);
        return govTrackLegislatorLists;
    }


}
