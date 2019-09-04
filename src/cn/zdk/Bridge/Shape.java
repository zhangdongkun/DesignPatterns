package cn.zdk.Bridge;

/**
 * 形状有2个维度：
 * 1.绘图
 * 2.填充---通过注入抽象类color 实现
 */
public abstract class Shape {
    protected abstract void draw();

    protected Color color;

    protected void setColor(Color color) {
        this.color = color;
    }

}
