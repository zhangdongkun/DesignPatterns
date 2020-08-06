package cn.zdk;

/**
 * 应该先set 再 get，否则应该重新 initialValue 方法 完成初始化
 */
public class ThreadLocalTest implements  Runnable {
    //匿名类不类实现初始化
    private  static  ThreadLocal<Integer> index =  new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return 0;
        }
    };

    @Override
    public void run() {
        for (int i = 0; i < 100;i++) {

            Integer j = index.get() + 1;
            index.set(j);
            System.out.println("当前线程：" + Thread.currentThread().getId() + "-->i:" + j);
        }

    }


    public static void main(String[] args) {

        for(int i =0 ; i < 3;i++) {
            Thread t = new Thread(new ThreadLocalTest());
            t.start();
        }
    }
}
