package cn.zdk.Singleton;

/***
 * 通过枚举来实现单例
 */
public enum Singleton {
    //理解为public static final Singleton INSTANCE;
    INSTANCE;
    Singleton() {//这个方法默认就是private的
       System.out.println("这是一个单例");
    }
    void print(String ss){
        System.out.println("在枚举里提供的方法:"+ss);
    }

}
