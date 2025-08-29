import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 가로(width)와 세로(height)를 입력받아 삼각형의 넓이를 구하는 프로그램

        // 가로, 세로 값과 넓이를 저장할 변수 선언1
        double width, height, area;

        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 가로 입력 받기
        System.out.print("가로 값을 입력하세요: ");
        width = sc.nextDouble();  // 실수형 입력을 받기 위해 nextDouble() 사용

        // 세로 입력 받기
        System.out.print("세로 값을 입력하세요: ");
        height = sc.nextDouble(); // 실수형 입력을 받기 위해 nextDouble() 사용

        // 삼각형의 넓이 계산: 넓이는 (가로 * 세로) / 2
        area = (width * height) / 2.0;  // 실수 계산을 위해 2.0으로 나누기

        // 결과 출력
        System.out.println("삼각형의 넓이는: " + area);

        // Scanner 객체 닫기
        sc.close();
    }
}
