package Request;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * Created by tommarler on 11/21/16.
 */
public class FollowTheMoneyRequest {

    public FollowTheMoneyRequest()
    {

    }

    public HttpResponse followTheMoneyRequest(String legislatorURL) throws Exception {

        HttpClient followTheMoneyClient = HttpClientBuilder.create().build();
        HttpGet followTheMoneyRequest = new HttpGet(legislatorURL);

        // TODO: (CloseableHttpResponse) Need to change to closeable
        HttpResponse followTheMoneyResponse = followTheMoneyClient.execute(followTheMoneyRequest);
        return followTheMoneyResponse;
    }
}
