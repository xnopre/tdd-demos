package xnopre;

import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.*;

public class ProcessorTest {
    @Test
    public void send_data_get_from_database() {
        Dao mockDao = mock(Dao.class);
        when(mockDao.getData()).thenReturn(new ArrayList<>(asList(1, 2, 3)));
        Api mockApi = mock(Api.class);
        Processor processor = new Processor(mockDao, mockApi);

        processor.doJob();

        verify(mockApi).transmit(new ArrayList<>(asList(1, 2, 3)));
    }
}
