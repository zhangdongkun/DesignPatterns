package cn.zdk.strategy;

import cn.zdk.filter.Person;

public class Test {
    public static void main(String[] args) {
        Operater operater = new Operater(new OperateAdd());
        int serult = operater.operate(1, 2);
        System.err.println(serult);



    }
}
