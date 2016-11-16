package OpenStates;

/**
 * Created by MikeWitter on 11/15/16.
 */
public class OpenStatesAPI implements IOpenStatesAPI{
    @Override
    public void legislator(String state) {
        System.out.println("This is going to rpint the state information out " + state);
    }

    @Override
    public void legislatorDetail(int legID) {
        System.out.println("This is going to print the legislatorDetail information " + legID);
    }
}
