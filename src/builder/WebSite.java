package builder;

public class WebSite {
    private String name;
    private Cms cms;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;
}
