class A implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=100; i++)
            System.out.println(i);
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a);
        t1.start();

        //람다 10줄을 한줄로 줄여 보았습니다.
        new Thread(() -> {for(int i=1; i<=100; i++)  System.out.println(i);}).start();

    }
}