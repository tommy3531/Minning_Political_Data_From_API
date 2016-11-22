package Request;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * Created by tommarler on 11/19/16.
 */
public class GovTrackRequest
{

    public GovTrackRequest()
    {

    }

    public HttpResponse govTrackSendRequest(String govTrackUrl) throws Exception {

        HttpClient govTrackClient = HttpClientBuilder.create().build();
        HttpGet govTrackRequest = new HttpGet(govTrackUrl);

        // TODO: (CloseableHttpResponse) Need to change to closeable
        CloseableHttpResponse govTrackResponse = (CloseableHttpResponse) govTrackClient.execute(govTrackRequest);
        System.out.println("This is from the govTrackSendRequest: " + govTrackResponse);
        return govTrackResponse;
    }

}
