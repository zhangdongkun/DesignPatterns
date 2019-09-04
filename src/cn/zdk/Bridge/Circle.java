package cn.zdk.Bridge;

public class Circle extends Shape {
    @Override
    protected void draw() {
        System.out.println("绘制一个圆形");
        this.color.fill();
    }
}
