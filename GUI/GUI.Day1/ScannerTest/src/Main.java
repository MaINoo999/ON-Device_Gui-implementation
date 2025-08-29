import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 가로(width) 세로(height)를 입력받아 삼각형의 넓이(Area)를 구하는 프로그램

        int width, height;
        double area;

        // Scanner 객체 생성: 사용자로부터 입력 받기
        Scanner sc = new Scanner(System.in);

        // 가로 입력받기
        System.out.print("width: ");
        // nextInt() 대신 nextLine()을 사용하고 Integer.parseInt()로 변환
        width = Integer.parseInt(sc.nextLine());

        // 세로 입력받기
        System.out.print("height: ");
        // 마찬가지로 nextLine()으로 입력받고, 정수로 변환
        height = Integer.parseInt(sc.nextLine());

        // 삼각형의 넓이 계산: 넓이는 (가로 * 세로) / 2
        area = (double) (width * height) / 2.0;  // 정수 * 실수 계산

        // 넓이 출력
        System.out.println("삼각형의 넓이는: " + area);

        // Scanner 객체를 닫아주는 것이 좋습니다.
        sc.close();
    }
}
