package cn.zdk.responsibility;

public class Logger implements Ilog {
    private int level;
    private Ilog nextIlog;

    public Logger(int level) {
        this.level = level;
    }

    @Override
    public void setNext(Ilog ilog) {
        this.nextIlog = ilog;


    }

    @Override
    public void log(String ss, int level) {
        if (this.level == level) {
            System.out.println("logger:---------->" + ss);
            return;
        }
        if (nextIlog != null) {
            nextIlog.log(ss, level);
        }


    }
}
