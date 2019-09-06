package cn.zdk.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/***
 * 过滤器就不写了 直接用个stream 的filter
 */
public class FilterTest {
    public static void main(String[] args) {
        Person.Builder builder1 = new Person.Builder();
        Person.Builder builder2 = new Person.Builder();
        builder1.age(30).job("IT").sex("1").name("zhangdongkun");
        builder2.age(20).job("66").sex("2").name("xiaoming");
        List<Person> personList = new ArrayList<>();
        personList.add(builder1.build());
        personList.add(builder2.build());

        Stream<String> stream = Stream.of("I", "love", "you", "too");
        //// 按照部门对员工分布组，并只保留员工的名字


        Map personMap =   personList.stream().collect(Collectors.groupingBy(Person::getAge));



    }

}
