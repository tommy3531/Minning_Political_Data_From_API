package OpenStates;

import UrlBuilder.UrlBuilder;
import User.User;

/**
 * Created by tommarler on 11/16/16.
 */
public class OpenStateManager {

    // Store User State
    String userState;

    // LegislatorUrl String
    String strLegislatorURL;

    public OpenStateManager() {

    }

    public void startOpenState() {

        // Get user input
        User user = new User();

        // Build Url
        UrlBuilder url = new UrlBuilder();

        // Ask user to enter two digit state
        userState = user.getState();

        // Send userState to legislatorURL to build URL
        strLegislatorURL = url.legislatorUrl(userState);
        System.out.println(strLegislatorURL);
    }
}
