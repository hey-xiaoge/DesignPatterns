package priv.xf.design.fiyweight;

public class Client {

    public static void main(String[] args) {
        System.out.println("===== 享元模式（蝇量模式） =====");

        //创建一个工厂
        WebSiteFactory factory = new WebSiteFactory();

        //客户以新闻形式发布网站
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use(new User("Jack"));

        //客户以博客形式发布网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("Tom"));

        //客户以博客形式发布网站
        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("Tony"));

        //客户以博客形式发布网站
        WebSite webSite4 = factory.getWebSiteCategory("博客");
        webSite4.use(new User("Janms"));

        System.out.println("网站分类总数：" + factory.getWebSiteCount());


    }
}
