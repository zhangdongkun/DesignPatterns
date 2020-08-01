package cn.zdk.strategy.compare;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 1. 每个类实现 compareTo 接口 ，进行比较
 * 但这不是最好的方式，更抽象扩展性更强的方式 是，把比较方法抽象出来以比较器的方式实现
 * 结合lambda 表达式 效率很高
 *
 */
public class SortTest<T> {

    public  void sort(T[] arr,Comparetor comparetor) {
        /**
         * 来一个冒泡排序
         */

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos =  comparetor.compare(arr[j],arr[minPos]) == -1 ? j : minPos;



            }
            swap(arr, i, minPos);
        }


    }


    /**
     * 交换数组中2个元素的位置
     *
     * @param arr
     * @param i
     * @param j
     */
     void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Person person = new Person(50, "zhang1", "11");
        Person person2 = new Person(30, "wang5", "22");
        Person person3 = new Person(32, "zhao6", "33");
        Person person4 = new Person(6, "xiaoliu", "33");
        SortTest<Person> test = new SortTest();
        Person[] arr = new Person[]{person, person2, person3,person4};
        AgeComparetor ageComparetor = new AgeComparetor();
       // test.sort(arr,ageComparetor);
        /**
         * 用lamda 表达式实现,通过变量引用实现泛型
         */
        Comparetor<Person> comparetor= (a,b)->{ return a.getAge() > b.getAge() ? 1:-1;} ;

        test.sort(arr,comparetor);

        System.out.println(Arrays.toString(arr));
    }
}
