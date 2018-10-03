package xnopre;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class ScriptTest {

    private ScriptUtils scriptUtils;
    private Script script;

    @Before
    public void setup() {
        scriptUtils = mock(ScriptUtils.class);
        script = new Script(scriptUtils);
    }
    @Test
    public void should_send_commands() {

        script.deploy("host1");

        verify(scriptUtils).scp("host1", "config.json");
        verify(scriptUtils).ssh("host1", "restart");
    }

    @Test
    public void should_break_if_error() {

        doThrow(new IllegalStateException("KO")).when(scriptUtils).scp(anyString(), anyString());
        script.deploy("host1");

        verify(scriptUtils).scp("host1", "config.json");
        verifyNoMoreInteractions(scriptUtils);
    }
}
