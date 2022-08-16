package builder;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Enterprise website");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALFRESKO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
