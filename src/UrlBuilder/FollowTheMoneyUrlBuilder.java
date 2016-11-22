package UrlBuilder;

/**
 * Created by tommarler on 11/21/16.
 */
public class FollowTheMoneyUrlBuilder {

    // http://api.followthemoney.org/
    String baseUrl = "http://api.followthemoney.org/";
    String apiKey = "4bed8fe186974ce2df75046bb3f3f220";
    String type = "&mode=json";

    public FollowTheMoneyUrlBuilder()
    {

    }

    public String followTheMoneylegislatorUrl(String moneyID) {

        //http://api.followthemoney.org/?c-t-eid=3837002&gro=d-id,c-t-id,c-t-sts,d-empl,d-occupation&APIKey=4bed8fe186974ce2df75046bb3f3f220&mode=json
        // Look for legislators who represent this state
        String followTheMoneylegID = moneyID;

        // Build url
        String strFollowTheMoneyUrl = baseUrl + "?c-t-eid=" + followTheMoneylegID + "&gro=d-id,c-t-id,c-t-sts,d-empl,d-occupation" + "&APIKey=" + apiKey + type;

        // legislatorUrl
        return strFollowTheMoneyUrl;

    }
}
