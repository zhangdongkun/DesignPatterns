package cn.zdk.strategy;

public class OperateMin implements OperateStrategy {

    @Override
    public int operate(int a, int b) {
        return  a - b;
    }
}
