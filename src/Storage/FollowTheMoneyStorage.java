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
            System.out.println("This is the Specific_Party: " + b.get("Specific_Party"));
            System.out.println("This is the Election_Year: " + c.get("Election_Year"));
            System.out.println("This is the Office_Sought: " + d.get("Office_Sought"));
            System.out.println("This is the Election_Status: " + e.get("Election_Status"));
            System.out.println("This is the Status_of_Candidate: " + f.get("Status_of_Candidate"));
            System.out.println("This is the Type_of_Contributor: " + g.get("Type_of_Contributor"));
            System.out.println("This is the State: " + h.get("State"));
            System.out.println("This is the Employer: " + i.get("Employer"));
            System.out.println("This is the Occupation: " + j.get("Occupation"));
            System.out.println("This is the Amount: " + "$" + k.get("Amount") + "\n");

            FollowTheMoneyLegislator moneyLegislator = new FollowTheMoneyLegislator(candidate);
            followTheMoneyArrayList.add(moneyLegislator);

        }
        return followTheMoneyArrayList;

    }
}
