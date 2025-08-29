import java.util.Scanner;  // Scanner 클래스를 불러와서 사용자 입력을 받을 준비를 함

public class Main {
    public static void main(String[] args) {
        int number;  // 정수를 저장할 변수 number 선언

        Scanner sc = new Scanner(System.in);  // Scanner 객체 생성하여 입력 받을 준비
        System.out.print("숫자입력: ");  // 사용자에게 숫자를 입력하라는 메시지 출력
        number = sc.nextInt();  // 사용자가 입력한 정수를 변수 number에 저장

        if(number % 2 != 0){  // number를 2로 나눈 나머지가 0이 아니면(즉, 홀수이면)
            System.out.println("홀수 입니다.");  // "홀수 입니다." 출력
        } else {  // 그렇지 않으면(짝수이면)
            System.out.println("짝수 입니다.");  // "짝수 입니다." 출력
        }

    }
}
