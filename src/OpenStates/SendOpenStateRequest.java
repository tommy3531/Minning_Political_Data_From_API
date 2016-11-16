package OpenStates;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;


import java.io.IOException;
import java.net.URISyntaxException;

import static org.apache.http.impl.client.HttpClients.*;

/**
 * Created by tommarler on 11/16/16.
 */
public class SendOpenStateRequest {

    public SendOpenStateRequest(){

    }

    public HttpResponse sendLegislatorRequest(String url) throws Exception {


        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);

        // TODO: (CloseableHttpResponse) Need to change to closeable
        HttpResponse response = client.execute(request);
        return response;




    }


}
