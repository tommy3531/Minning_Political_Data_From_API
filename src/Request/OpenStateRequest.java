package Request;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class OpenStateRequest {

    public OpenStateRequest() {

    }

    public HttpResponse sendLegislatorRequest(String url) throws Exception {

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);

        // TODO: (CloseableHttpResponse) Need to change to closeable
        HttpResponse response = client.execute(request);
        return response;
    }
}
