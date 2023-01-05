package xnopre;

public class DataProcessor {
    private final Dao dao;
    private final Filter filter;
    private final Transformer transformer;
    private final Sender sender;

    public DataProcessor(Dao dao, Filter filter, Transformer transformer, Sender sender) {
        this.dao = dao;
        this.filter = filter;
        this.transformer = transformer;
        this.sender = sender;
    }

    public void doThejob() {
        this.sender.transmit(this.transformer.doTheJob(this.filter.doTheJob(this.dao.getAllUser())));
    }
}
