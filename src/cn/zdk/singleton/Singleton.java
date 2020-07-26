package cn.zdk.singleton;

/***
 * 通过枚举来实现单例
 * 把真实需要的方法，放进枚中，借用枚举的原理实现
 */
public enum Singleton {
    INSTANCE;

    public void doSomeThing() {

        System.out.println("我是实际需要被调用的方法");
    }
}
