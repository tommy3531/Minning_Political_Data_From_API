package OpenStates;

import org.apache.http.HttpResponse;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by tommarler on 11/16/16.
 */
public class OpenStateJsonParser {

    public OpenStateJsonParser() {


    }

    public String legislatorJson(HttpResponse response) throws IOException {

        String json = EntityUtils.toString(response.getEntity());
        return json;
    }


}
