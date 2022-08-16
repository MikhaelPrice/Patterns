package wrapper;

public class DeveloperWrapper implements Developer{

    Developer developer;

    public DeveloperWrapper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
