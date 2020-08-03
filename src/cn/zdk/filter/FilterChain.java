package cn.zdk.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain  implements  Filter{

    private List<Filter> filterList = new ArrayList<>();
    @Override
    public boolean doFilter() {

        for (Filter f:filterList ) {
             if(!f.doFilter()){
                 return  false;
             }
        }
        return true;
    }

    /**
     * 这里是一个小技巧，返回this 对象 ，这样便可以使用this 对象
     * @param filter
     * @return
     */
    public FilterChain add(Filter filter) {
        this.filterList.add(filter);
        return this;
    }
}
