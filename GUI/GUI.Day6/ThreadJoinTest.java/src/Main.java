class SumThread extends Thread {
    private long sum;

    //Getter, Setter
    public long getSum() {
        return sum;
    }
    public void setSum(long sum) {
        this.sum = sum;
    }
    //필수 메소드

    @Override
    public void run() {
        for(int i=1; i<=100; i++)
            sum += i;
    }
}

public class Main {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        //기초 스레드 동기화!!!
        try {
            sumThread.join();
            sumThread.setDaemon(true); //혹시 main 스레드가 종료되면 해당 스레드도 같이 종료.
            //해당 스레드가 종료될 때까지 호출한 스레드(main thread)가 종료되지 않는다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1 ~ 100까지 합 " + sumThread.getSum());
    }
}