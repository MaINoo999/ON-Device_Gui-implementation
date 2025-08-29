import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 두 정수 변수 a, b를 선언
        int a, b;

        // Scanner 객체를 생성하여 사용자 입력을 받기 위한 준비
        Scanner sc = new Scanner(System.in);

        // 사용자에게 a의 값을 입력하라는 메시지를 출력하고, 입력받은 값을 정수로 변환하여 변수 a에 저장
        System.out.print("a의 값을 입력하세요: ");
        a = Integer.parseInt(sc.nextLine());  // 입력받은 값을 문자열로 받고, 정수로 변환하여 a에 저장

        // 사용자에게 b의 값을 입력하라는 메시지를 출력하고, 입력받은 값을 정수로 변환하여 변수 b에 저장
        System.out.print("b의 값을 입력하세요: ");
        b = Integer.parseInt(sc.nextLine());  // 입력받은 값을 문자열로 받고, 정수로 변환하여 b에 저장

        // 값 교환하기
        // 임시 변수 temp를 사용하여 a의 값을 저장
        int temp = a;  // a의 값을 temp 변수에 저장하여 임시로 보관

        a = b;  // 이제 a는 b의 값을 가짐
        b = temp;  // b는 temp에 저장된 원래의 a 값을 가짐

        // 교환된 값들을 출력
        System.out.println("교환된 값: ");
        System.out.println("a = " + a);  // 교환 후 a의 값 출력
        System.out.println("b = " + b);  // 교환 후 b의 값 출력

        // Scanner 객체를 닫아주는 것이 좋음
        sc.close();  // Scanner 객체를 닫아서 리소스 해제
    }
}
