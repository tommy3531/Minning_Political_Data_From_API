package OpenStates;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP.*;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.apache.http.impl.client.HttpClients.*;

/**
 * Created by tommarler on 11/16/16.
 */
public class SendOpenStateRequest {

    public SendOpenStateRequest(){

    }

    public StatusLine sendLegislatorRequest(String url) throws Exception {


        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        StatusLine code = (StatusLine) response.getStatusLine();

        System.out.println("Response Code: "
                        + response.getStatusLine().getStatusCode());

        return code;

    }


}
