package UrlBuilder;


/**
 * Created by tommarler on 11/16/16.
 */
public class UrlBuilder {

    String baseUrl = "http://openstates.org/api/v1//legislators/";
    String apiKey = "4a8beb6a33b845edb52173f9f5764b62";
    String strSearchState;
    String strLegislatorUrl;


    public UrlBuilder() {


    }

    public String legislatorUrl(String userState) {

        // Look for legislators who represent this state
        strSearchState = userState;

        // Build url
        strLegislatorUrl = baseUrl + "?state=" + strSearchState + "&apikey=" + apiKey;

        // legislatorUrl
        return strLegislatorUrl;

    }


}
