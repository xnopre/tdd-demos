package xnopre;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.*;

public class DataProcessorTest {
    @Test
    public void should_process_and_transmit_data() {

        List<User> users = asList(new User(), new User(), new User(), new User());
        List<User> users2 = asList(new User(), new User());

        Dao dao = mock(Dao.class);
        Filter filter = mock(Filter.class);
        Transformer transformer = mock(Transformer.class);
        Sender sender = mock(Sender.class);
        DataProcessor dataProcessor = new DataProcessor(dao, filter, transformer, sender);
        when(dao.getAllUser()).thenReturn(users);
        when(filter.doTheJob(users)).thenReturn(users2);
        when(transformer.doTheJob(users2)).thenReturn("Alice,John");

        dataProcessor.doThejob();

        verify(sender).transmit("Alice,John");

//        Mockito.doThrow(new Exception("tutu")).when(sender).transmit(Matchers.anyString());
    }
}
