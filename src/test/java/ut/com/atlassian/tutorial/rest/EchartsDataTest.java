package ut.com.atlassian.tutorial.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import com.atlassian.tutorial.rest.EchartsData;
import com.atlassian.tutorial.rest.EchartsDataModel;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.GenericEntity;

public class EchartsDataTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {
        EchartsData resource = new EchartsData();

        Response response = resource.getMessage();
        final EchartsDataModel message = (EchartsDataModel) response.getEntity();

        assertEquals("wrong message","Hello World",message.getMessage());
    }
}
