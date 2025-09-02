import java.util.Scanner;

class Calculator
{
    //1.멤버 변수(필드) - (X)
    //2.생성자 (디폴트 생성자만) - 아무것도 적지 않으면 자동으로 디폴트 생성자 만들어줌
    //3.멤버 메소드 + - * /
    public int plus(int a, int b){
        return a + b;
    }
    public int minus(int a, int b){
        return a - b;
    }
    public int multiple(int a, int b){
        return a * b;
    }
    public double divide(int a, int b){
        return (double)a / b;
    }
}
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main
{
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("1 번 정수를 입력하세요 : ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("2 번 정수를 입력하세요 : ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println("+ 결과 출력 : " + cal.plus(a, b));
        System.out.println("- 결과 출력 : " + cal.minus(a, b));
        System.out.println("* 결과 출력 : " + cal.multiple(a, b));
        System.out.println("/ 결과 출력 : " + cal.divide(a, b));

    }
}