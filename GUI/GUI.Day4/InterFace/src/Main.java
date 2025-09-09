//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class A{
    public static int max = 10;
}
//다른 언어들은 추상 메소드를 통해서 재정의를 강제하는데
abstract class B{
    public void method1(){
    }
}
class C extends B{
    @Override
    public void method1() {
        super.method1();
    }
}
//interface는 메소드를 통해서 재정의를 강제한다.
interface RemoteControl {
    int MAX_VALUE = 10;
    int MIN_VALUE = 0;

    void turnOn();
    void turnOff();
}
class TV implements RemoteControl {
    @Override
    public void turnOn() {

    }
    @Override
    public void turnOff() {

    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(RemoteControl.MAX_VALUE);
        System.out.println(RemoteControl.MIN_VALUE);
        System.out.println(A.max);
        C c = new C();
    }
}