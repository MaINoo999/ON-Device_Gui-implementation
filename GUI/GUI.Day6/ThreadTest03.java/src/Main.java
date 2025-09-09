//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class AlphaThread extends Thread
{
    @Override
    public void run() {
        //'A'~'Z', 'a'~'z';
        for(int i='A'; i<='Z'; i++)
            System.out.println((char)i);
        for(int i='a'; i<='z'; i++)
            System.out.println((char)i);
    }
}
class NumberThread implements Runnable
{
    @Override
    public void run() {
        //1~10000;
        for(int i=1; i<=10000; i++)
            System.out.println(i);
    }
}
public class Main {
    public static void main(String[] args) {
        //상속으로 만들어진 스레드클래스
        AlphaThread at = new AlphaThread();
        at.start();
        //Runnable로 구현받아 처리하는 스레드 클래스
        NumberThread nt = new NumberThread();
        Thread t = new Thread(nt);
        t.start();
    }
}