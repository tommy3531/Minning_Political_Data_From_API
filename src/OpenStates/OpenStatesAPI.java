package OpenStates;

/**
 * Created by MikeWitter on 11/15/16.
 */
public class OpenStatesAPI implements IOpenStatesAPI{

    // http://www.openstates.org/api/v1//legislators/?state=mo&active=true&apikey=4a8beb6a33b845edb52173f9f5764b62&fields=first_name,last_name,leg_id
    @Override
    public void legislator(String state) {
        System.out.println("This is going to rpint the state information out " + state);
    }

    @Override
    public void legislatorDetail(int legID) {
        System.out.println("This is going to print the legislatorDetail information " + legID);
    }
}
