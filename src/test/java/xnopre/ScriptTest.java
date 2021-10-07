package xnopre;

import org.junit.Test;
import org.mockito.Mockito;

public class ScriptTest {
    @Test
    public void should_send_scp_command() {

        Utils utils = Mockito.mock(Utils.class);
        Script script = new Script(utils);

        script.deploy("host1");

        Mockito.verify(utils).scp("host1", "config.json");
    }
}
