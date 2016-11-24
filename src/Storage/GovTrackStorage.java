package Storage;

import DataModel.GovTrackLegislator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by tommarler on 11/23/16.
 */
public class GovTrackStorage {

    public ArrayList<GovTrackLegislator> govTrackLegislatorArrayList;

    public GovTrackStorage()
    {
        govTrackLegislatorArrayList = new ArrayList<>();
    }

    public ArrayList<GovTrackLegislator> storeGovTrackLegislator(File legislatorcurrent) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(new FileReader("legislators-current.json"));
        JSONArray jsonArray = (JSONArray) obj;
        for (Object obj11 : jsonArray) {
            JSONObject jsonObject1 = (JSONObject) obj11;
            JSONObject idObj = (JSONObject) jsonObject1.get("id");
            JSONObject nameObj = (JSONObject) jsonObject1.get("name");
            JSONObject bioObj = (JSONObject) jsonObject1.get("bio");

            String firstname = (String) nameObj.get("first");
            String lastname = (String) nameObj.get("last");
            String birthday = (String) bioObj.get("birthday");
            String religion = (String) bioObj.get("religion");
            String bioguide_id = (String) idObj.get("bioguide");
            String thomas_id = (String) idObj.get("thomas");
            String lis_id = (String) idObj.get("lis");
            Long govTrack_id = (Long) idObj.get("govtrack");
            String openSecrets_id = (String) idObj.get("opensecrets");
            Long votesmart_id = (Long) idObj.get("votesmart");
            List fec_id = (List) idObj.get("fec");
            Long cspan_id = (Long) idObj.get("cspan");
            String wikipedia_id = (String) idObj.get("wikipedia");
            Long maplight_id = (Long) idObj.get("maplight");
            Long icpsr_id = (Long) idObj.get("icpsr");
            String wikidata_id = (String) idObj.get("wikidata");
            String googleEntity_id = (String) idObj.get("google_entity_id");


            GovTrackLegislator govTrackFillClass = new GovTrackLegislator(firstname, lastname, birthday, religion, bioguide_id, thomas_id, lis_id,
                    govTrack_id, openSecrets_id, votesmart_id, fec_id, cspan_id, wikipedia_id, maplight_id, icpsr_id, wikidata_id, googleEntity_id);


            govTrackLegislatorArrayList.add(govTrackFillClass);

        }
        return govTrackLegislatorArrayList;
    }


}
