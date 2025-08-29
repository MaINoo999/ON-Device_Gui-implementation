import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] score = new int[3];
        String[] subjects = {"국어", "영어", "수학"};

        Scanner sc = new Scanner(System.in);

        // 점수 입력
        for(int i = 0; i < 3; i++) {
            System.out.print(subjects[i] + " 점수를 입력하세요: ");
            score[i] = sc.nextInt();
        }

        // 입력한 점수 출력
        for(int i = 0; i < 3; i++) {
            System.out.println(subjects[i] + ": " + score[i] + "점");
        }

        sc.close(); // Scanner 닫기 (좋은 습관)
    }
}
