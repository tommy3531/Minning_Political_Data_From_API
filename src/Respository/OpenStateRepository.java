package Respository;

import DataModel.Legislator;
import DataModel.LegislatorDetail;

import java.util.List;
import java.util.ArrayList;

public class OpenStateRepository {

    public ArrayList<Legislator> legislatorItems;
    public ArrayList<LegislatorDetail> legislatorDetailItems;

    public OpenStateRepository() {

        legislatorItems = new ArrayList<>();
        legislatorDetailItems = new ArrayList<>();

    }

    public void legislatorRepo(ArrayList<Legislator> legislatorList) {

        legislatorItems = legislatorList;

        System.out.println("This is the legislatorRepo: ");
        for(Legislator leg : legislatorItems)
        {
            System.out.println(leg.first_name);
            System.out.println(leg.last_name);
            System.out.println(leg.leg_id);
        }
    }

    public void legislatorDetailRepo(ArrayList<LegislatorDetail> legislatorDetailList){

        legislatorDetailItems = legislatorDetailList;

        System.out.println("This is the legislatorDetailRepo: ");
        for(LegislatorDetail legDetail : legislatorDetailItems)
        {
            System.out.println("This is the firstName: " + legDetail.first_name + "\n");
            System.out.println("This is the lastname: " + legDetail.last_name + "\n");
            System.out.println("This is the party: " + legDetail.party + "\n");
            System.out.println("This is the photo_url: " + legDetail.photo_url + "\n");
            System.out.println("This is the district: " + legDetail.district + "\n");
            System.out.println("This is the level: " + legDetail.level + "\n");
            System.out.println("This is the chamber: " + legDetail.chamber + "\n");
            System.out.println("This is the office_address: " + legDetail.office_address + "\n");
            System.out.println("This is the email: " + legDetail.email + "\n");
            System.out.println("This is the leg_id: " + legDetail.leg_id + "\n");
            System.out.println("This is the committee_id: " + legDetail.committee_id + "\n");
            System.out.println("This is the committee: " + legDetail.committee + "\n");
            System.out.println("This is the position: " + legDetail.position + "\n");
            System.out.println("This is the roles: " + legDetail.Roles + "\n");




        }

    }

    // This returns
    public ArrayList<Legislator> getLegislatorList(){
        return legislatorItems;
    }

}
