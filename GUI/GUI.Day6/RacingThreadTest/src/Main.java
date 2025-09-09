

public class Main {
    static int balance = 0;
    static final int ITER = 100_000;

    public static synchronized void increse(){
        int tmp = balance; //일기
        Thread.yield();   //스레드간의 경쟁
        balance = tmp + 1;
    }
    public static synchronized void decrese(){
        int tmp = balance;
        Thread.yield();
        balance = tmp - 1;
    }

    public static void main(String[] args) {
        balance = 0;
        Thread t1 = new Thread(()->{
            for(int i=0; i<ITER; i++)
                increse();
        });
        Thread t2 = new Thread(()->{
            for(int i=0; i<ITER; i++)
                decrese();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("최종 Balance의 값 : " + balance);

    }
}




