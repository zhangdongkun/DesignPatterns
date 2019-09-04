package cn.zdk.factory;

/**
 * 目前的理解抽象工厂的好处是可以把多个属性组合起来
 */
public class RedCircleFactory implements Factory {
    @Override
    public Shape prodcutShape() {
        return new Circle();
    }

    @Override
    public Color productColor() {
        return new Red();
    }
}
