package Storage;

import java.util.ArrayList;

import DataModel.OpenStateLegislator;
import DataModel.OpenStateLegislatorDetail;
import DataModel.Roles;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;

public class OpenStateStorage
{

    public ArrayList<OpenStateLegislator> openStateLegislatorArrayList;
    public ArrayList<OpenStateLegislatorDetail> openStateLegislatorDetailArrayList;

    public OpenStateStorage()
    {

        openStateLegislatorArrayList = new ArrayList<>();
        openStateLegislatorDetailArrayList = new ArrayList<>();

    }

    public ArrayList<OpenStateLegislator> storeLegislator(String jsonResponse) throws org.json.simple.parser.ParseException
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

            OpenStateLegislator fillOpenStateLegislator = new OpenStateLegislator(firstName, lastName, legID);

            openStateLegislatorArrayList.add(fillOpenStateLegislator);

        }

        return openStateLegislatorArrayList;

    }

    public ArrayList<OpenStateLegislatorDetail> storeLegislatorDetail(String legislatorDetailJsonResponse) throws org.json.simple.parser.ParseException
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

        OpenStateLegislatorDetail fillOpenStateLegislatorDetail = new OpenStateLegislatorDetail(firstName, lastName, party, photo_url, district, level, chamber, office_address, email, legID, roles);

        openStateLegislatorDetailArrayList.add(fillOpenStateLegislatorDetail);

        return openStateLegislatorDetailArrayList;

    }

    // This returns
    public ArrayList<OpenStateLegislatorDetail> getOpenStateLegislatorDetailArrayList()
    {
        return openStateLegislatorDetailArrayList;
    }

    // This returns
    public ArrayList<OpenStateLegislator> getLegislatorList()
    {
        return openStateLegislatorArrayList;
    }


}
