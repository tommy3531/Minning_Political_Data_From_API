package Parser;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class OpenStateJsonParser
{

    public OpenStateJsonParser()
    {


    }

    public String legislatorJson(HttpResponse response) throws IOException
    {

        String json = EntityUtils.toString(response.getEntity());
        return json;
    }

    public String legislatorDetailJson(HttpResponse response) throws IOException
    {

        String legislatorDetailJson = EntityUtils.toString(response.getEntity());
        return legislatorDetailJson;
    }


}
