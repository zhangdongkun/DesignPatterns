package cn.zdk.strategy;

public class OperateAdd implements  OperateStrategy {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
