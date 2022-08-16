package chainOfResponsibility;

public class EmailNotofier extends Notifier{
    public EmailNotofier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: "+message);
    }
}
