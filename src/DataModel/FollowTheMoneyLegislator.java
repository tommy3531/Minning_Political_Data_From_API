package DataModel;

/**
 * Created by tommarler on 11/21/16.
 */
public class FollowTheMoneyLegislator {

    public String candidate;

    public FollowTheMoneyLegislator()
    {

    }

    public FollowTheMoneyLegislator(String candidate)
    {
        this.candidate = candidate;
//        this.last_name = last_name;
//        this.leg_id = leg_id;
    }

    public String getCandidate()
    {

        return candidate;
    }

    public void setCandidate(String candidate)
    {

        this.candidate = candidate;
    }
}
