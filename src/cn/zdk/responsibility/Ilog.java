package cn.zdk.responsibility;

public interface Ilog {
    int LOG = 1;
    int ERROR = 2;
    int WARN = 3;

    void setNext(Ilog ilog);

    void log(String ss,int level);

}
