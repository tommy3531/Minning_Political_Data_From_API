package UrlBuilder;

public class OpenStateUrlBuilder {

    String baseUrl = "http://openstates.org/api/v1//legislators/";
    String apiKey = "4a8beb6a33b845edb52173f9f5764b62";
    String legislatorFields = "&fields=first_name,last_name,leg_id";
    String legislatorDetailFields = "&fields=party,photo_url,district,level,chamber,office_address,email,leg_id,committee_id,committee,position";
    String strSearchState;
    String strLegislatorUrl;
    String strSearchLegislatorID;
    String strLegislatorDetailUrl;


    public OpenStateUrlBuilder() {


    }

    public String OpenStatelegislatorUrl(String userState) {

        // Look for legislators who represent this state
        strSearchState = userState;

        // Build url
        strLegislatorUrl = baseUrl + "?state=" + strSearchState + "&apikey=" + apiKey + legislatorFields;

        // legislatorUrl
        return strLegislatorUrl;

    }

    public String OpenStatelegislatorDetailUrl(String userLegID){

        // Give me information according to this legislator ID
        strSearchLegislatorID = userLegID;

        // Build my Url with the LegislatorID
        // TODO: Add Fields to restrict URL legislatorDetailFields
        strLegislatorDetailUrl = baseUrl + strSearchLegislatorID + "/" + "?apikey=" + apiKey + legislatorDetailFields;

        // return the legislatorDetailURL
        return strLegislatorDetailUrl;

    }


}
