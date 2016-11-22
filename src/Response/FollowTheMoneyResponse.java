package Response;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by tommarler on 11/21/16.
 */
public class FollowTheMoneyResponse {

    public FollowTheMoneyResponse()
    {

    }

    public String followTheMoneyJson(HttpResponse response) throws IOException
    {
        String json = EntityUtils.toString(response.getEntity());
        return json;
    }
}
