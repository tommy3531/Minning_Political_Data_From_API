package Respository;

import DataModel.Legislator;
import DataModel.LegislatorDetail;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.ArrayList;

public class OpenStateRepository
{

    public ArrayList<Legislator> legislatorItems;
    public ArrayList<LegislatorDetail> legislatorDetailItems;

    public OpenStateRepository()
    {

        legislatorItems = new ArrayList<>();
        legislatorDetailItems = new ArrayList<>();

    }

    public void legislatorRepo(ArrayList<Legislator> legislatorList)
    {

        legislatorItems = legislatorList;

        System.out.println("This is the legislatorRepo: ");

        for(Legislator leg : legislatorItems)
        {
            System.out.println("This is the firstName: " + leg.first_name);
            System.out.println("This is the LastName: " + leg.last_name);
            System.out.println("This is the Leg_id: " + leg.leg_id + "\n");
        }
    }

    public void legislatorDetailRepo(ArrayList<LegislatorDetail> legislatorDetailList)
    {

        legislatorDetailItems = legislatorDetailList;

        System.out.println("This is the legislatorDetailRepo: ");
        for(LegislatorDetail legDetail : legislatorDetailItems)
        {
            System.out.println("This is the firstName: " + legDetail.first_name);
            System.out.println("This is the lastname: " + legDetail.last_name);
            System.out.println("This is the party: " + legDetail.party);
            System.out.println("This is the photo_url: " + legDetail.photo_url);
            System.out.println("This is the district: " + legDetail.district);
            System.out.println("This is the level: " + legDetail.level);
            System.out.println("This is the chamber: " + legDetail.chamber);
            System.out.println("This is the office_address: " + legDetail.office_address);
            System.out.println("This is the email: " + legDetail.email);
            System.out.println("This is the leg_id: " + legDetail.leg_id);
            System.out.println("This is the roles: " + legDetail.roles);

            JSONArray roleArray = (JSONArray)legDetail.roles;

            for(Object obj : roleArray)
            {

                if (obj instanceof JSONArray)
                {
                    System.out.println("We have a JSONArray");
                }
                else if (obj instanceof JSONObject)
                {
                    JSONObject jsonObject = (JSONObject)obj;
                    String committee = (String) jsonObject.get("committee");
                    String committee_id = (String) jsonObject.get("committee_id");
                    String position = (String) jsonObject.get("position");
                    System.out.println("This is the roles committee: " + committee);
                    System.out.println("This is the roles committee_id: " + committee_id);
                    System.out.println("This is the roles position: " + position + "\n");

                }
                else if (obj instanceof Object)
                {
                    System.out.println("We have an Object");

                }
                else
                {

                    System.out.println("We are not dealing with a JSONArray, JSONObject or Object, werid");
                }
            }

        }

    }

}
