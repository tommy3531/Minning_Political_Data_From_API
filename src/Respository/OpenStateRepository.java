package Respository;

import DataModel.Legislator;
import java.util.List;
import java.util.ArrayList;

public class OpenStateRepository {

    public ArrayList<Legislator> legislatorItems;

    public OpenStateRepository() {

        legislatorItems = new ArrayList<>();

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

    // This returns
    public ArrayList<Legislator> getLegislatorList(){
        return legislatorItems;
    }

}
