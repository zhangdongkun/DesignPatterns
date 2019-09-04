package cn.zdk.Bridge;

/**
 * 桥接模式（Bridge Pattern），将抽象部分与它的实现部分分离，使它们都可以独立地变化。更容易理解的表述是：实现系统可从多种维度分类，
 * 桥接模式将各维度抽象出来，各维度独立变化，之后可通过聚合，将各维度组合起来，减少了各维度间的耦合。
 */
public class Test {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Color color = new Red();
        shape.setColor(color);
        shape.draw();

    }
}
