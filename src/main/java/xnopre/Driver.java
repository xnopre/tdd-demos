package xnopre;

public class Driver {
    private Connector connector;

    public Driver(Connector connector) {
        this.connector = connector;
    }

    public void openBarrier(int i) {
        try {
            this.connector.transmit("OB" + i);
        } catch (Exception e) {
            throw new DriverException();
        }
    }
}
