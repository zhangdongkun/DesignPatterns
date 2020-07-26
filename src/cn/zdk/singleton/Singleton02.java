package cn.zdk.singleton;

/**
 * 通过静态内部类实现单例，可以实现懒加载推荐
 *
 */
public class Singleton02 {
    private Singleton02(){
        System.out.println("创建一个实例");
    }

    private static class Inner {
        public static Singleton02 singleton02 = new Singleton02();
    }

    public  static  Singleton02 getInstance() {
         return Inner.singleton02;

    }


}
