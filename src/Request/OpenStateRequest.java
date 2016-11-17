package Request;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class OpenStateRequest {

    public OpenStateRequest() {

    }

    public HttpResponse sendLegislatorRequest(String legislatorURL) throws Exception {

        HttpClient legislatorClient = HttpClientBuilder.create().build();
        HttpGet legislatorRequest = new HttpGet(legislatorURL);

        // TODO: (CloseableHttpResponse) Need to change to closeable
        HttpResponse legislatorResponse = legislatorClient.execute(legislatorRequest);
        return legislatorResponse;
    }

    public HttpResponse sendLegislatorDetailRequest(String legislatorDetailURL) throws Exception {

        HttpClient legislatorDetailClient = HttpClientBuilder.create().build();
        HttpGet legislatorDetailRequest = new HttpGet(legislatorDetailURL);
        HttpResponse legislatorDetailResponse = legislatorDetailClient.execute(legislatorDetailRequest);
        return legislatorDetailResponse;
    }
}
