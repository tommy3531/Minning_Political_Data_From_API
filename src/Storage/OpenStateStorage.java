package Storage;

import java.util.ArrayList;
import DataModel.Legislator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;

public class OpenStateStorage {

    public ArrayList<Legislator> stateLegislator;

    public OpenStateStorage() {

        stateLegislator = new ArrayList<>();

    }

    public ArrayList<Legislator> storeLegislator(String jsonResponse) throws org.json.simple.parser.ParseException {

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

            stateLegislator.add(fillLegislator);

        }

        return stateLegislator;

    }

    // This returns
    public ArrayList<Legislator> getLegislatorList(){
        return stateLegislator;
    }
}
