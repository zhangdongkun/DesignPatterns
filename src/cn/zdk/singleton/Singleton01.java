package cn.zdk.singleton;

/**
 * 最简单的方式推荐
 */
public class Singleton01 {
    private static final Singleton01 instance = new Singleton01();

    private Singleton01() {

    }

    public static Singleton01 getInstance() {
        return instance;
    }


}
