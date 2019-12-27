package it.com.atlassian.tutorial.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import com.atlassian.tutorial.rest.EchartsData;
import com.atlassian.tutorial.rest.EchartsDataModel;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;

public class EchartsDataFuncTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {

        String baseUrl = System.getProperty("baseurl");
        String resourceUrl = baseUrl + "/rest/echartsData/1.0/message";

        RestClient client = new RestClient();
        Resource resource = client.resource(resourceUrl);

        EchartsDataModel message = resource.get(EchartsDataModel.class);

        assertEquals("wrong message","Hello World",message.getMessage());
    }
}
