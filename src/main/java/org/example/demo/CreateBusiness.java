package org.example.demo;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/9/9
 **/
public class CreateBusiness {
    /**
     * 业务线名字
     */
    private String name ;
    /**
     * 业务线描述
     */
    private String desc ;
    /**
     * 负责人
     */
    private String owner;

    public static void main(String[] args)  {
        String a = "99999999";
        new Thread(new Runnable() {
            @Override
            public void run() {
                test(a);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                test2();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test(a);
            }
        }).start();

    }

    private static void test2()  {
        long b = 99999999;
        String a = String.valueOf(b).intern();
        System.out.println("test2");
        test(a);
    }

    private static void test(String a)  {
        synchronized (a){
            System.out.println(a);
            try {
                Thread.sleep(1212455);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
