package cn.zdk.factory;

public class Test {
    public static void main(String[] args) {
        Factory factory = new RedCircleFactory();
       Color color =   factory.productColor();
       color.fill();
    }
}
