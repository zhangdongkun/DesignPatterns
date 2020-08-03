package cn.zdk.filter;

public class HTMLFilter implements  Filter {
    @Override
    public boolean doFilter() {
        System.out.println("this is html filter");
        return false;
    }
}
