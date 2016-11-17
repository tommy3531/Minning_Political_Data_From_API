package Respository;

import DataModel.Legislator;
import java.util.ArrayList;

public class OpenStateRepository {

    public ArrayList<Legislator> legislatorItems;

    public OpenStateRepository() {

    }

    public void startOpenStartRepo(ArrayList<Legislator> legislatorList) {

        legislatorItems = legislatorList;

        System.out.println("This is from the startOpenStartRepo: " + legislatorItems);
    }

    public void legislatorItemsLoop(ArrayList<Legislator> legislatorList){

        System.out.println("This is from the legislatorItemsLoop: " + legislatorList);

    }
}
