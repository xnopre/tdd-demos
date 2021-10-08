package xnopre;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.fail;
import static org.mockito.Mockito.*;

public class DriverTest {

    @Test
    public void should_call_connecter_transmit() {

        Connector mockConnector = mock(Connector.class);
        Driver driver = new Driver(mockConnector);

        driver.openBarrier(2);

        verify(mockConnector).transmit("OB2");
    }

    @Test
    public void should_throw_exception_if_not_transmit() {

        Connector mockConnector = mock(Connector.class);
        Driver driver = new Driver(mockConnector);
        doThrow(new RuntimeException("Connector error !!")).when(mockConnector).transmit(Mockito.anyString());

        try {
            driver.openBarrier(2);
            fail("Devrait déclencher une DriverException");
        } catch (DriverException e) {
            // OK
        }

    }
}
