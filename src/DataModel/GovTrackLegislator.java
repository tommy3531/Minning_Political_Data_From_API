package DataModel;

/**
 * Created by tommarler on 11/19/16.
 */
public class GovTrackLegislator {

    public String first_name;
    public String last_name;
    public String bioguide_id;
    public String os_id;
    public String twitter_id;
    public String youtube_id;

    public GovTrackLegislator()
    {

    }

    public GovTrackLegislator(String first_name, String last_name, String bioguide_id, String os_id, String twitter_id, String youtube_id)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.bioguide_id = bioguide_id;
        this.os_id = os_id;
        this.twitter_id = twitter_id;
        this.youtube_id = youtube_id;
    }

    // FirstName
    public String getFirstName()
    {

        return first_name;
    }

    public void setFirstName(String first_name)
    {

        this.first_name = first_name;
    }

    // LastName
    public String getLastName()
    {

        return last_name;
    }

    public void setLastName(String last_name)
    {

        this.last_name = last_name;
    }

    // Bioguideid
    public String getBioguide_id()
    {

        return first_name;
    }

    public void setBioguide_id(String bioguide_id)
    {

        this.bioguide_id = bioguide_id;
    }

    // OpenSecrets.org
    public String getOs_id()
    {

        return os_id;
    }

    public void setOs_id(String os_id)
    {

        this.os_id = os_id;
    }

}
