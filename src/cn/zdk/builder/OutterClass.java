package cn.zdk.builder;

/**
 * 回顾下内部类
 * 静态内部类和非静态内部类的区别
 *
 *1. 静态内部类可以有静态成员，而非静态内部类则不能有静态成员。
 *2.静态内部类可以访问外部类的静态变量，而不可访问外部类的非静态变量；
 *3.非静态内部类的非静态成员可以访问外部类的非静态变量。
 *4.静态内部类的创建不依赖于外部类，而非静态内部类必须依赖于外部类的创建而创建。
 *

 */
public class OutterClass {
    private /*static*/ String name;
    public /*static*/ class Inner {
        private /*static*/ String age;
       public void print() {
           System.out.println(name);
       }
    }

    public static void main(String[] args) {
        OutterClass outterClass = new OutterClass();
        Inner inner = outterClass.new Inner();
    }
}
