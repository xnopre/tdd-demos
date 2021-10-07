package xnopre;

public class Script {
    private Utils utils;

    public Script(Utils utils) {
        this.utils = utils;
    }

    public void deploy(String host1) {
        this.utils.scp(host1, "config.json");
    }
}
