package cn.zdk.strategy;

public class Operater implements OperateStrategy {
    private OperateStrategy operateStrategy ;
    Operater (OperateStrategy operateStrategy){
        this.operateStrategy = operateStrategy;
    }

    @Override
    public int operate(int a, int b) {
        return operateStrategy.operate(a,b);
    }
}
