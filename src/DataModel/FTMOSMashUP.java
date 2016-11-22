package DataModel;

/**
 * Created by tommarler on 11/21/16.
 */
public class FTMOSMashUP {

    public String OpenStateID;
    public String FollowTheMoneyID;

    public FTMOSMashUP()
    {

    }


    public FTMOSMashUP(String OpenStateID, String FollowTheMoneyID)
    {
        this.OpenStateID = OpenStateID;
        this.FollowTheMoneyID = FollowTheMoneyID;

    }

    // OpenStateID
    public String getOpenStateID()
    {

        return OpenStateID;
    }

    public void setOpenStateID(String OpenStateID)
    {

        this.OpenStateID = OpenStateID;
    }

    // OpenStateID
    public String getFollowTheMoneyID()
    {

        return FollowTheMoneyID;
    }

    // Follow the Money ID
    public void setFollowTheMoneyID(String FollowTheMoneyID)
    {

        this.FollowTheMoneyID = FollowTheMoneyID;
    }
}
