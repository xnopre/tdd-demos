import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class NotifierTest {
    @Test
    public void should_notify() {
        Dao dao = mock(Dao.class);
        MailerConnector mailerConnector = mock(MailerConnector.class);
        Notifier notifier = new Notifier(dao, mailerConnector);
        when(dao.getAllEmails()).thenReturn("a@a.com;b@b.com");

        notifier.notifyAllUsers("coucou");

        verify(mailerConnector).send("a@a.com;b@b.com", "coucou");
    }
}
