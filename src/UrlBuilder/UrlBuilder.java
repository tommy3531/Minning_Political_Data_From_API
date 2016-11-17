package UrlBuilder;


/**
 * Created by tommarler on 11/16/16.
 */
public class UrlBuilder {
//    public String first_name;
//    public String last_name;
//    public String party;
//    public String photo_url;
//    public String district;
//    public String level;
//    public String chamber;
//    public String office_address;
//    public String email;
//    public String leg_id;
//    public String committee_id;
//    public String committee;
//    public String position;

    String baseUrl = "http://openstates.org/api/v1//legislators/";
    String apiKey = "4a8beb6a33b845edb52173f9f5764b62";
    String legislatorFields = "&fields=first_name,last_name,leg_id";
    String legislatorDetailFields = "&fields=party,photo_url,district,level,chamber,office_address,email,leg_id,committee_id,committee,position";
    String strSearchState;
    String strLegislatorUrl;
    String strSearchLegislatorID;
    String strLegislatorDetailUrl;


    public UrlBuilder() {


    }

    public String legislatorUrl(String userState) {

        // Look for legislators who represent this state
        strSearchState = userState;

        // Build url
        strLegislatorUrl = baseUrl + "?state=" + strSearchState + "&apikey=" + apiKey + legislatorFields;

        // legislatorUrl
        return strLegislatorUrl;

    }

    public String legislatorDetailUrl(String userLegID){

        // Give me information according to this legislator ID
        strSearchLegislatorID = userLegID;

        // Build my Url with the LegislatorID
        // TODO: Add Fields to restrict URL legislatorDetailFields
        strLegislatorDetailUrl = baseUrl + strSearchLegislatorID + "/" + "?apikey=" + apiKey;

        // return the legislatorDetailURL
        return strLegislatorDetailUrl;

    }


}
