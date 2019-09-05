package cn.zdk.adapter;

public class SDCardImpl implements SDCard {

    @Override
    public void readSD() {
        System.out.println("读取SD数据....");
    }

    @Override
    public void writeSD() {
        System.out.println("写SD数据....");
    }
}
