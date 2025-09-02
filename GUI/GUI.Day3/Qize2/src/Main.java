import java.util.Scanner; // 사용자 입력을 받기 위해 Scanner 클래스를 불러옵니다.

/**
 * @file GradeCalculator.java
 * @brief 사용자로부터 점수 N을 입력받아 if-else 문을 사용하여 학점을 판별하고 출력하는 프로그램입니다.
 *        N은 0부터 100 사이의 정수라고 가정합니다.
 */
public class Main {

    public static void main(String[] args) {
        // Scanner 객체를 생성하여 키보드 입력을 받을 준비를 합니다.
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 점수 입력을 안내합니다.
        System.out.print("정수 N (0~100)을 입력하세요: ");
        int N = scanner.nextInt(); // 사용자로부터 정수 N을 입력받습니다.

        // 학점 판별을 위한 if-else if-else 문을 시작합니다.
        if (N >= 90 && N <= 100) { // N이 90점 이상 100점 이하인 경우
            System.out.println("A학점입니다.");
        } else if (N >= 80 && N <= 89) { // N이 80점 이상 89점 이하인 경우
            System.out.println("B학점입니다.");
        } else if (N >= 70 && N <= 79) { // N이 70점 이상 79점 이하인 경우
            System.out.println("C학점입니다.");
        } else if (N >= 60 && N <= 69) { // N이 60점 이상 69점 이하인 경우
            System.out.println("D학점입니다.");
        } else { // 위 모든 조건에 해당하지 않는 경우 (즉, N이 60점 미만인 경우)
            System.out.println("F학점입니다.");
        }

        // Scanner 객체를 닫아서 리소스를 해제합니다.
        scanner.close();
    }
}