package xnopre;

public class Script {
    private ScriptUtils scriptUtils;

    public Script(ScriptUtils scriptUtils) {
        this.scriptUtils = scriptUtils;
    }

    public void deploy(String host) {
        try {
            scriptUtils.scp(host, "config.json");
        } catch (IllegalStateException e) {
            return;
        }
        scriptUtils.ssh(host, "restart");
    }
}
