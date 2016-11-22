package Response;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class OpenStateJsonResponse
{

    public OpenStateJsonResponse()
    {


    }

    public String OpenStatelegislatorJson(HttpResponse response) throws IOException
    {

        String json = EntityUtils.toString(response.getEntity());
        return json;
    }

    public String OpenStatelegislatorDetailJson(HttpResponse response) throws IOException
    {

        String legislatorDetailJson = EntityUtils.toString(response.getEntity());
        return legislatorDetailJson;
    }


}
