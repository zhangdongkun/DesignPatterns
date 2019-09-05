package cn.zdk.adapter;

/**
 * 适配器模式，实现 sd 卡读取TF 卡
 */
public class SDadapter implements SDCard {
    private TFCard tfCard;

    public void setTfCard(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public void readSD() {
        if (tfCard == null) {
            throw  new  RuntimeException("请注入tfcard");
        }
        tfCard.readTF();
    }

    @Override
    public void writeSD() {

    }
}
