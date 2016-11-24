package DataModel;

import java.util.List;

public class GovTrackLegislator {

    public String first_name;
    public String last_name;
    public String birthday;
    public String religion;

    public String bioguide_id;
    public String thomas_id;
    public String lis_id;
    public Long govTrack_id;
    public String openSecrets_id;
    public Long votesmart_id;
    public List fec_id;
    public Long cspan_id;
    public String wikipedia_id;
    public Long maplight_id;
    public Long icpsr_id;
    public String wikidata_id;
    public String googleEntity_id;


    public GovTrackLegislator()
    {

    }

    public GovTrackLegislator(String first_name, String last_name, String birthday, String religion, String bioguide_id,
                              String thomas_id, String lis_id, Long govTrack_id, String openSecrets_id, Long votesmart_id, List fec_id,
                              Long cspan_id, String wikipedia_id, Long maplight_id, Long icpsr_id, String wikidata_id, String googleEntity_id)

    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.religion = religion;
        this.bioguide_id = bioguide_id;
        this.thomas_id = thomas_id;
        this.lis_id = lis_id;
        this.govTrack_id = govTrack_id;
        this.openSecrets_id = openSecrets_id;
        this.votesmart_id = votesmart_id;
        this.fec_id = fec_id;
        this.lis_id = lis_id;
        this.cspan_id = cspan_id;
        this.wikipedia_id = wikipedia_id;
        this.maplight_id = maplight_id;
        this.icpsr_id = icpsr_id;
        this.wikidata_id = wikidata_id;
        this.googleEntity_id = googleEntity_id;
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


    // Birthday
    public String getBirthday()
    {
        return birthday;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
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

    // Thomas_ID
    public String getThomas_id()
    {
        return thomas_id;
    }

    public void setThomas_id(String thomas_id)
    {
        this.thomas_id = thomas_id;
    }

    // Lis_id
    public String getLis_id()
    {

        return lis_id;
    }

    public void setLis_id(String lis_id)
    {

        this.lis_id = lis_id;
    }

    // GovTrack_id
    public Long getGovTrack_id()
    {

        return govTrack_id;
    }

    public void setGovTrack_id(Long govTrack_id)
    {

        this.govTrack_id = govTrack_id;
    }

    // OpenSecrets
    public String getOpenSecrets_id()
    {

        return openSecrets_id;
    }

    public void setOpenSecrets_id(String openSecrets_id)
    {

        this.openSecrets_id = openSecrets_id;
    }

    // votesmartID
    public Long getVotesmart_id()
    {

        return votesmart_id;
    }

    public void setVotesmart_id(Long votesmart_id)
    {

        this.votesmart_id = votesmart_id;
    }

    // votesmartID
    public List getFec_id()
    {

        return fec_id;
    }

    public void setFec_id(List fec_id)
    {

        this.fec_id = fec_id;
    }

    // Cspan_id
    public Long getCspan_id()
    {

        return cspan_id;
    }

    public void setCspan_id(Long cspan_id)
    {

        this.cspan_id = cspan_id;
    }

    // wikipedia_id
    public String getWikipedia_id()
    {

        return wikipedia_id;
    }

    public void setWikipedia_id(String wikipedia_id)
    {

        this.wikipedia_id = wikipedia_id;
    }

    // getmapLight_id
    public Long getmapLight_id()
    {

        return maplight_id;
    }

    public void setMaplight_id(Long maplight_id)
    {

        this.maplight_id = maplight_id;
    }

    // icpsr_id
    public Long getMaplight_id()
    {

        return icpsr_id;
    }

    public void setIcpsr_id(Long icpsr_id)
    {

        this.icpsr_id = icpsr_id;
    }

    // wikidata_id
    public String getwikidata_id()
    {

        return wikidata_id;
    }

    public void setwikidata_id(String wikidata_id)
    {

        this.wikidata_id = wikidata_id;
    }

    // googleEntity_id
    public String getGoogleEntity_id()
    {

        return googleEntity_id;
    }

    public void setGoogleEntity_id(String googleEntity_id)
    {

        this.googleEntity_id = googleEntity_id;
    }


}
