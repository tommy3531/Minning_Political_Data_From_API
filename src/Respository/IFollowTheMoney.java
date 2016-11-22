package Respository;

import DataModel.FollowTheMoneyLegislator;
import DataModel.OpenStateLegislator;
import DataModel.OpenStateLegislatorDetail;

import java.util.ArrayList;

/**
 * Created by tommarler on 11/21/16.
 */
public interface IFollowTheMoney {

    ArrayList<FollowTheMoneyLegislator> getFollowTheMoneyLegislatorData(ArrayList<FollowTheMoneyLegislator> followTheMoneyArrayList);
    void getFollowTheMoneyLegislatorByLegID(ArrayList<FollowTheMoneyLegislator> followTheMoneyArrayList, String followTheMoneyID);
    void getFollowTheMoneyLegislatorByLastName(ArrayList<FollowTheMoneyLegislator> followTheMoneyArrayList, String lastName);



}
