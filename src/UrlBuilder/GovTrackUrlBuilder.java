package UrlBuilder;

public class GovTrackUrlBuilder
{
    String strSearchState;
    String strGovTrackStateUrl;
    String baseUrl = "http://www.govtrack.us/api/v2/";

    public GovTrackUrlBuilder()
    {

    }

    public String govTrackUrlBuilder(String userState) {

        // https://www.govtrack.us/api/v2/role?current=true&state=MO

        // Look for legislators who represent this state
        strSearchState = userState;

        // Build url
        strGovTrackStateUrl = baseUrl + "role?current=true" + "&state=" + strSearchState;

        // legislatorUrl
        return strGovTrackStateUrl;

    }
}
