package OpenStates;

import UrlBuilder.UrlBuilder;
import User.User;
import org.apache.http.StatusLine;


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

    public void startOpenState() throws Exception {

        // Get user input
        User user = new User();

        // Build Url
        UrlBuilder url = new UrlBuilder();

        // Send HttpRequest
        SendOpenStateRequest sendOpenSR = new SendOpenStateRequest();

        // Ask user to enter two digit state
        userState = user.getState();

        // Send userState to legislatorURL to build URL
        strLegislatorURL = url.legislatorUrl(userState);
        System.out.println("This is the strLegislatorURL: " + strLegislatorURL);

        // Send request to OpenstateAPI
        StatusLine status = sendOpenSR.sendLegislatorRequest(strLegislatorURL);
        System.out.println("This is the statusline: " + status);

        //
    }
}
