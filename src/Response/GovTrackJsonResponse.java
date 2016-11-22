package Response;


import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class GovTrackJsonResponse
{

    public GovTrackJsonResponse()
    {

    }

    public String GovTrackLegislatorJson(HttpResponse response) throws IOException
    {

        String json = EntityUtils.toString(response.getEntity());
        return json;
    }
}
