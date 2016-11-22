package Respository;

import DataModel.OpenStateLegislator;
import DataModel.OpenStateLegislatorDetail;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.util.ArrayList;

public class OpenStateRepository implements IOpenStateRespository {

    public ArrayList<OpenStateLegislator> openStateLegislatorList;
    public ArrayList<OpenStateLegislatorDetail> openStateLegislatorDetailList;

    public OpenStateRepository() {

        //ArrayList<OpenStateLegislator> legislatorItems;
        openStateLegislatorList = new ArrayList<>();
        openStateLegislatorDetailList = new ArrayList<>();

    }

    @Override
    public ArrayList<OpenStateLegislator> getLegislatorData(ArrayList<OpenStateLegislator> openStateLegislatorList) {
        //System.out.println("This is the legislatorRepo: ");

        for (OpenStateLegislator leg : openStateLegislatorList) {
            System.out.println("This is the firstName: " + leg.first_name);
            System.out.println("This is the LastName: " + leg.last_name);
            System.out.println("This is the Leg_id: " + leg.leg_id + "\n");
        }

        return openStateLegislatorList;
    }

    @Override
    public ArrayList<OpenStateLegislatorDetail> getLegislatorDetailData(ArrayList<OpenStateLegislatorDetail> openStateLegislatorDetailList) {

        System.out.println("This is the legislatorDetailRepo: ");
        for (OpenStateLegislatorDetail legDetail : openStateLegislatorDetailList) {
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

            JSONArray roleArray = (JSONArray) legDetail.roles;

            for (Object obj : roleArray) {

                if (obj instanceof JSONArray) {
                    System.out.println("We have a JSONArray");
                } else if (obj instanceof JSONObject) {
                    JSONObject jsonObject = (JSONObject) obj;
                    String committee = (String) jsonObject.get("committee");
                    String committee_id = (String) jsonObject.get("committee_id");
                    String position = (String) jsonObject.get("position");
                    System.out.println("This is the roles committee: " + committee);
                    System.out.println("This is the roles committee_id: " + committee_id);
                    System.out.println("This is the roles position: " + position + "\n");

                } else if (obj instanceof Object) {
                    System.out.println("We have an Object");

                } else {

                    System.out.println("We are not dealing with a JSONArray, JSONObject or Object, werid");
                }
            }

        }

        return openStateLegislatorDetailList;
    }

    @Override
    public void getLegislatorByLegID(ArrayList<OpenStateLegislator> openStateLegislatorItems, String leg_id)
    {
        openStateLegislatorList = openStateLegislatorItems;
        System.out.println("This is the value we are looking for: " + leg_id);
        String targetName = leg_id;
        System.out.println("This is printing out the value of targetName: " + targetName);
        OpenStateLegislator result = null;
        for (OpenStateLegislator leg : openStateLegislatorList)
        {
            if(targetName.equals(leg.leg_id))
            {
                result = leg;

                // TODO: Print out values from search
                System.out.println("This is the result from the getLegislatorByLegID result: " + result.leg_id);
            }

        }
    }

    @Override
    public void getLegislatorByLastName(ArrayList<OpenStateLegislator> openStateLegislatorItems, String lastName)
    {
        openStateLegislatorList = openStateLegislatorItems;
        System.out.println("\nThis is value we are looking for: " + lastName);
        String targetName = lastName;
        System.out.println("This is printing out the value of targetName: " + targetName + "\n");
        OpenStateLegislator result = null;
        for (OpenStateLegislator leg : openStateLegislatorList)
        {
            if(targetName.equals(leg.last_name))
            {
                result = leg;

                System.out.println("This is the result from the getLegislatorByLastName result: " + result.last_name);
            }
        }

    }

    @Override
    public void getLegislatorDetailByLegID(ArrayList<OpenStateLegislatorDetail> openStateLegislatorDetailsItems, String leg_id)
    {
        openStateLegislatorDetailList = openStateLegislatorDetailsItems;
        String targetName = leg_id;
        OpenStateLegislatorDetail result = null;
        for(OpenStateLegislatorDetail legDetail : openStateLegislatorDetailList)
        {
            if(targetName.equals(legDetail.leg_id))
            {
                result = legDetail;
                System.out.println("This is from the getLegislatorDetailByLegID: " + result.last_name);

            }
        }

    }

}
