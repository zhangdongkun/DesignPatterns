package cn.zdk.complex;

public class TaxStrategyFactory {

    public static TaxStrategy getTaxStrategy(TaxType taxType) {

        if (taxType == TaxType.INNER) {

            return new InnerTaxStrategy();
        } else if (taxType == TaxType.OUTER) {
            return new OuterTaxStrategy();
        } else {
            throw new RuntimeException("错误的类型");
        }
    }

}
