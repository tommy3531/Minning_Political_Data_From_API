package Respository;

import DataModel.FollowTheMoneyLegislator;
import DataModel.OpenStateLegislator;

import java.util.ArrayList;

/**
 * Created by tommarler on 11/21/16.
 */
public class FollowTheMoneyRespository implements IFollowTheMoney {
    @Override
    public ArrayList<FollowTheMoneyLegislator> getFollowTheMoneyLegislatorData(ArrayList<FollowTheMoneyLegislator> followTheMoneyArrayList) {
        System.out.println("This is the followTheMoneyRep: ");
        for(FollowTheMoneyLegislator moneyLegislator : followTheMoneyArrayList)
        {
            System.out.println("This is the followTheMoney Candidate: " + moneyLegislator.candidate);
            System.out.println("This is the followTheMoney Specific_Party: " + moneyLegislator.specific_Party);
            System.out.println("This is the followTheMoney election_Year: " + moneyLegislator.election_Year);
            System.out.println("This is the followTheMoney office_sought: " + moneyLegislator.office_sought);
            System.out.println("This is the followTheMoney election_Status: " + moneyLegislator.election_Status);
            System.out.println("This is the followTheMoney status_Of_Candidate: " + moneyLegislator.status_Of_Candidate);
            System.out.println("This is the followTheMoney type_of_Contributor: " + moneyLegislator.type_of_Contributor);
            System.out.println("This is the followTheMoney state: " + moneyLegislator.state);
            System.out.println("This is the followTheMoney employer: " + moneyLegislator.employer);
            System.out.println("This is the followTheMoney occupation: " + moneyLegislator.occupation);
            System.out.println("This is the followTheMoney amount: " + moneyLegislator.amount);
        }

        return followTheMoneyArrayList;
    }

    @Override
    public void getFollowTheMoneyLegislatorByLegID(ArrayList<FollowTheMoneyLegislator> openStateLegislatorItems, String followTheMoneyID) {

    }

    @Override
    public void getFollowTheMoneyLegislatorByLastName(ArrayList<FollowTheMoneyLegislator> openStateLegislatorItems, String firstName) {

    }
}
