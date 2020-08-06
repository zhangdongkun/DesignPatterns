package cn.zdk.complex;

public interface TaxStrategy {
    double cul(long amount);
    // 新增自注册接口
    void register();
}

class InnerTaxStrategy implements  TaxStrategy {

    @Override
    public double cul(long amount) {

        return amount * 0.6;
    }

    @Override
    public void register() {
        MapTaxStrategyFactory.registeStrategy(TaxType.INNER,new InnerTaxStrategy());
    }
}
 class OuterTaxStrategy implements  TaxStrategy {
     @Override
     public double cul(long amount) {
         return amount * 0.2;
     }

     @Override
     public void register() {
         MapTaxStrategyFactory.registeStrategy(TaxType.OUTER,new OuterTaxStrategy());

     }
 }