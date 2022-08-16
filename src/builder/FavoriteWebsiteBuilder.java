package builder;

public class FavoriteWebsiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Only for lovers");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.CHEPACHEM);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(1);
    }
}
