package cn.zdk.singleton;

public class Test {
    public static void main(String[] args) {
        Singleton s =   Singleton.INSTANCE;
        s.print("xxxxxxxx");

        Singleton02 singleton02 =    Singleton02.getInstance();
        Singleton02 singleton02X =    Singleton02.getInstance();
        System.out.println(singleton02==singleton02X);

        for (int i = 0; i <10;i++) {
            new Thread(()->  System.out.println( Singleton02.getInstance().hashCode())).start();
            new Thread(()->  System.out.println( Singleton02.getInstance().hashCode())).start();
            new Thread(()->   System.out.println( Singleton02.getInstance().hashCode())).start();
            new Thread(()->   System.out.println( Singleton02.getInstance().hashCode())).start();

        }


    }
}
