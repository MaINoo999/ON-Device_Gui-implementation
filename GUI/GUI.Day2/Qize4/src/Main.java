import java.util.Scanner; // 사용자로부터 입력을 받기 위해 Scanner 클래스 가져오기

public class Main { // 자바 프로그램의 시작 클래스
    public static void main(String[] args) { // main 메서드: 자바 프로그램 실행 시작 지점

        int[] score = new int[3]; // 크기 3짜리 정수 배열 생성 (국어, 영어, 수학 점수 저장용)
        int total = 0;            // 총합을 저장할 변수 초기화
        double average;           // 평균을 저장할 변수 (소수점까지 계산 위해 double 사용)

        Scanner sc = new Scanner(System.in); // Scanner 객체 생성 (사용자로부터 입력 받기 위해)

        System.out.println("성적 입력"); // 안내 문구 출력

        // 성적을 3번 입력받아 배열에 저장하고, 동시에 총점 계산
        for (int i = 0; i < 3; i++) {
            score[i] = sc.nextInt();   // 사용자로부터 정수 입력받아 배열에 저장
            total += score[i];         // 입력받은 점수를 총점에 누적
        }

        average = (double) total / 3; // 총점을 3으로 나눠 평균 계산 (정수 나눗셈 방지 위해 double로 형변환)

        // 결과 출력
        System.out.println("총점 : " + total);          // 총점 출력
        System.out.printf("평균 : %.2f\n", average);    // 평균을 소수점 둘째 자리까지 출력

        sc.close(); // Scanner 객체 닫기 (자원 누수를 방지하기 위한 좋은 습관)
    }
}
