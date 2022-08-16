package proxy;

public class RealProject implements Project {

    private String url;

    public void download() {
        System.out.println("Downloading project from " + url);
    }

    public RealProject(String url) {
        this.url = url;
        download();
    }

    @Override
    public void run() {
        System.out.println("Running project..." + url);
    }
}
