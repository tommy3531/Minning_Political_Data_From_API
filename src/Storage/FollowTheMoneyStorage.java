package Storage;

import DataModel.FollowTheMoneyLegislator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FollowTheMoneyStorage {

    public ArrayList<FollowTheMoneyLegislator> followTheMoneyArrayList;


    public FollowTheMoneyStorage()
    {
        followTheMoneyArrayList = new ArrayList<>();
    }

    public ArrayList<FollowTheMoneyLegislator> storeFollowTheMoneyLegislator(String jsonResponse) throws org.json.simple.parser.ParseException, IOException {

        JSONParser parser = new JSONParser();
//        String jsonResponse1 = "followthemoney.json";
        //Object obj = parser.parse(new FileReader(jsonResponse1));
        Object obj = parser.parse(jsonResponse);
        JSONObject metaInfo = (JSONObject) obj;
        JSONObject object = new JSONObject(metaInfo);
        JSONArray getArray = (JSONArray) object.get("records");

        // TODO: (Clean) Need to clean up this code and also need to load the class object
        for (Object obj55 : getArray) {
            JSONObject jsonObject1 = (JSONObject) obj55;
            JSONObject a = (JSONObject) jsonObject1.get("Candidate");
            JSONObject b = (JSONObject) jsonObject1.get("Specific_Party");
            JSONObject c = (JSONObject) jsonObject1.get("Election_Year");
            JSONObject d = (JSONObject) jsonObject1.get("Office_Sought");
            JSONObject e = (JSONObject) jsonObject1.get("Election_Status");
            JSONObject f = (JSONObject) jsonObject1.get("Status_of_Candidate");
            JSONObject g = (JSONObject) jsonObject1.get("Type_of_Contributor");
            JSONObject h = (JSONObject) jsonObject1.get("State");
            JSONObject i = (JSONObject) jsonObject1.get("Employer");
            JSONObject j = (JSONObject) jsonObject1.get("Occupation");
            JSONObject k = (JSONObject) jsonObject1.get("Amount");
            String candidate = (String) a.get("Candidate");
            String specific_Party = (String) b.get("Specific_Party");
            String election_Year = (String) c.get("Election_Year");
            String office_sought = (String) d.get("Office_Sought");
            String election_Status = (String) e.get("Election_Status");
            String status_Of_Candidate = (String) f.get("Status_of_Candidate");
            String type_of_Contributor = (String) g.get("Type_of_Contributor");
            String state = (String) h.get("State");
            String employer = (String) i.get("Employer");
            String occupation = (String) j.get("Occupation");
            String amount =  "$" + k.get("Amount") + "\n";

            FollowTheMoneyLegislator moneyLegislator = new FollowTheMoneyLegislator(candidate, specific_Party, election_Year, office_sought, election_Status, status_Of_Candidate, type_of_Contributor, state, employer, occupation, amount);
            followTheMoneyArrayList.add(moneyLegislator);

        }
        return followTheMoneyArrayList;

    }
}
