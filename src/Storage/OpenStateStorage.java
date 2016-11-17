package Storage;

import java.util.ArrayList;
import DataModel.Legislator;
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
        return array;

    }
}
