package priv.xf.design.fiyweight;

import java.util.HashMap;

//工厂类，根据需求返回一个网站
public class WebSiteFactory {

    //集合，充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入池中，并且返回
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            //如果没有就创建一个网站
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    //获取网站分类总数
    public int getWebSiteCount() {
        return pool.size();
    }

}
