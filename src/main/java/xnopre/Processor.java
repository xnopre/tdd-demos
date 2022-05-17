package xnopre;

public class Processor {
    private Dao dao;
    private Api api;

    public Processor(Dao dao, Api api) {
        this.dao = dao;
        this.api = api;
    }

    public void doJob() {
        this.api.transmit(this.dao.getData());
    }
}
