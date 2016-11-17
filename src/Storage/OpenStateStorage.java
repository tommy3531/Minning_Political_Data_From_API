package Storage;

import java.util.ArrayList;
import java.util.List;
import DataModel.Legislator;
import DataModel.LegislatorDetail;
import DataModel.Roles;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;

public class OpenStateStorage
{

    public ArrayList<Legislator> legislatorArrayList;
    public ArrayList<LegislatorDetail> legislatorDetailArrayList;

    public OpenStateStorage()
    {

        legislatorArrayList = new ArrayList<>();
        legislatorDetailArrayList = new ArrayList<>();

    }

    public ArrayList<Legislator> storeLegislator(String jsonResponse) throws org.json.simple.parser.ParseException
    {

        JSONParser parser = new JSONParser();

        // Root Element obj
        Object obj = parser.parse(jsonResponse);

        // Cast obj to array
        JSONArray array = (JSONArray)obj;

        // @TODO: (JSONDATA) Need to sort this JSON data

        for(int i = 0; i < array.size(); i++){

            JSONObject jsonObject = (JSONObject)array.get(i);

            String firstName = (String) jsonObject.get("first_name");
            String lastName = (String) jsonObject.get("last_name");
            String legID = (String) jsonObject.get("leg_id");

            Legislator fillLegislator = new Legislator(firstName, lastName, legID);

            legislatorArrayList.add(fillLegislator);

        }

        return legislatorArrayList;

    }

    public ArrayList<LegislatorDetail> storeLegislatorDetail(String legislatorDetailJsonResponse) throws org.json.simple.parser.ParseException
    {

        JSONParser parser = new JSONParser();

        Object obj = parser.parse(legislatorDetailJsonResponse);

        JSONObject jsonObject = (JSONObject)obj;

        String firstName = (String) jsonObject.get("first_name");
        String lastName = (String) jsonObject.get("last_name");
        String party = (String) jsonObject.get("party");
        String photo_url = (String) jsonObject.get("photo_url");
        String district = (String) jsonObject.get("district");
        String level = (String) jsonObject.get("level");
        String chamber = (String) jsonObject.get("chamber");
        String office_address = (String) jsonObject.get("office_address");
        String email = (String) jsonObject.get("email");
        String legID = (String) jsonObject.get("leg_id");
        ArrayList<Roles> roles = (ArrayList) jsonObject.get("roles");

        LegislatorDetail fillLegislatorDetail = new LegislatorDetail(firstName, lastName, party, photo_url, district, level, chamber, office_address, email, legID, roles);

        legislatorDetailArrayList.add(fillLegislatorDetail);

        return legislatorDetailArrayList;

    }

    // This returns
    public ArrayList<LegislatorDetail> getLegislatorDetailArrayList()
    {
        return legislatorDetailArrayList;
    }

    // This returns
    public ArrayList<Legislator> getLegislatorList()
    {
        return legislatorArrayList;
    }


}
