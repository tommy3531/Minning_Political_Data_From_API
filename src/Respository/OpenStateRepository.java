package Respository;

import DataModel.OpenStateLegislator;
import DataModel.OpenStateLegislatorDetail;
import DataModel.Roles;
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
        System.out.println("This is the legislatorRepo: ");

        for (OpenStateLegislator leg : openStateLegislatorList) {
            System.out.println("This is the OpenState firstName: " + leg.first_name);
            System.out.println("This is the OpenState LastName: " + leg.last_name);
            System.out.println("This is the OpenState Leg_id: " + leg.leg_id + "\n");
        }

        return openStateLegislatorList;
    }

    @Override
    public ArrayList<OpenStateLegislatorDetail> getLegislatorDetailData(ArrayList<OpenStateLegislatorDetail> openStateLegislatorDetailItems) {
        openStateLegislatorDetailList = openStateLegislatorDetailItems;
        System.out.println("This is the legislatorDetailRepo: ");
        System.out.println(openStateLegislatorDetailList);

        for (OpenStateLegislatorDetail legDetail : openStateLegislatorDetailList) {
            System.out.println("This is the OpenState firstName: " + legDetail.first_name);
            System.out.println("This is the OpenState lastname: " + legDetail.last_name);
            System.out.println("This is the OpenState party: " + legDetail.party);
            System.out.println("This is the OpenState photo_url: " + legDetail.photo_url);
            System.out.println("This is the OpenState district: " + legDetail.district);
            System.out.println("This is the OpenState level: " + legDetail.level);
            System.out.println("This is the OpenState chamber: " + legDetail.chamber);
            System.out.println("This is the OpenState office_address: " + legDetail.office_address);
            System.out.println("This is the OpenState email: " + legDetail.email);
            System.out.println("This is the OpenState leg_id: " + legDetail.leg_id);
            JSONArray roleArray = (JSONArray)legDetail.roles;
            for(Object obj : roleArray)
            {
                JSONObject jsonObject = (JSONObject)obj;
                System.out.println(jsonObject.get("committee"));
                String committee = (String) jsonObject.get("committee");
                String committee_id = (String) jsonObject.get("committee_id");
                String position = (String) jsonObject.get("position");
                System.out.println("This is the OpenState roles committee: " + committee);
                System.out.println("This is the OpenState roles committee_id: " + committee_id);
                System.out.println("This is the OpenState roles position: " + position + "\n");
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
                System.out.println("This is the leg_id from the getLegislatorByLegID result: " + leg.leg_id);
                System.out.println("This is the firstName from the getLegislatorByLegID result: " + leg.first_name);
                System.out.println("This is the lastName from the getLegislatorByLegID result: " + leg.last_name);

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

                System.out.println("This is from the OpenStateRepository(getLegislatorbyLastName): " + result.last_name);
            }
        }

    }

    @Override
    public void getLegislatorDetailByLegID(ArrayList<OpenStateLegislatorDetail> openStateLegislatorDetailsItems, String leg_id)
    {
        System.out.println("This is printing from the OpenStateRepository: ");
        openStateLegislatorDetailList = openStateLegislatorDetailsItems;
        String targetName = leg_id;


        for (OpenStateLegislatorDetail legDetail : openStateLegislatorDetailList)
        {
            if(targetName.equals(legDetail.leg_id))
            System.out.println("This is the OpenState firstName: " + legDetail.first_name);
            System.out.println("This is the OpenState lastname: " + legDetail.last_name);
            System.out.println("This is the OpenState party: " + legDetail.party);
            System.out.println("This is the OpenState photo_url: " + legDetail.photo_url);
            System.out.println("This is the OpenState district: " + legDetail.district);
            System.out.println("This is the OpenState level: " + legDetail.level);
            System.out.println("This is the OpenState chamber: " + legDetail.chamber);
            System.out.println("This is the OpenState office_address: " + legDetail.office_address);
            System.out.println("This is the OpenState email: " + legDetail.email);
            System.out.println("This is the OpenState leg_id: " + legDetail.leg_id);
            JSONArray roleArray = (JSONArray)legDetail.roles;
            for(Object obj : roleArray)
            {
                JSONObject jsonObject = (JSONObject)obj;
                System.out.println(jsonObject.get("committee"));
                String committee = (String) jsonObject.get("committee");
                String committee_id = (String) jsonObject.get("committee_id");
                String position = (String) jsonObject.get("position");
                System.out.println("This is the OpenState roles committee: " + committee);
                System.out.println("This is the OpenState roles committee_id: " + committee_id);
                System.out.println("This is the OpenState roles position: " + position + "\n");

            }
        }

    }

}
