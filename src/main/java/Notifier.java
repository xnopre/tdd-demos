public class Notifier {

    private Dao dao;
    private MailerConnector mailerConnector;

    public Notifier(Dao dao, MailerConnector mailerConnector) {
        this.dao = dao;
        this.mailerConnector = mailerConnector;
    }

    public void notifyAllUsers(String message) {
        mailerConnector.send(dao.getAllEmails(), message);
    }
}
