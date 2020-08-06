package cn.zdk.complex;

public class TaxService {

    public static void main(String[] args) {

       double tax = TaxStrategyFactory.getTaxStrategy(TaxType.OUTER).cul(1000);
       System.out.println(tax);
    }
}
