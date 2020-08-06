package cn.zdk.complex;

import java.util.HashMap;
import java.util.Map;

/**
 * 通过map 优化 工厂类 取消 if else
 */
public class MapTaxStrategyFactory {
    public  static Map<TaxType,  TaxStrategy> taxStrategyMap = new HashMap();

    static {
        taxStrategyMap.put(TaxType.INNER,new InnerTaxStrategy());
        taxStrategyMap.put(TaxType.OUTER,new OuterTaxStrategy());

    }

    /**
     * 获得具体策略
     * @param taxType
     * @return
     */
    public  static  TaxStrategy  getTaxStrategy(TaxType taxType) {

        return taxStrategyMap.get(taxType);

    }



    public  static  TaxStrategy  registeStrategy(TaxType taxType,TaxStrategy taxStrategy) {

        return taxStrategyMap.put(taxType,taxStrategy);

    }

}
