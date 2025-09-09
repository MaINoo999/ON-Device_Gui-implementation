import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();       // 랜덤 숫자
        int secretNum = random.nextInt(100)+1;      //1~100 사이 맞춰야하는 숫자 랜덤으로 선택

        Scanner scanner = new Scanner(System.in);
        int player;  // 플레이어가 입력하는 숫자 저장 변수
        int play = 0;   // 플레이 횟수 0부터 시작

        System.out.println("UP & Down 게임을 시작합니다.");
        System.out.println("1~100 사이의 숫자중에 정답을 맞춰보세요!");

        while (true){
            System.out.print("입력 : ");
            player = scanner.nextInt();         //입력한 숫자 저장
            play ++;                            // 숫자를 입력을 반복할때마다 1상승

            if (player < secretNum){
                System.out.println("UP! 입력한 숫자 보다 큽니다!");
            } else if (player > secretNum) {
                System.out.println("Down! 입력한 숫자 보다 작습니다!");
            }else{
                System.out.println("정답! "+secretNum+"이 맞습니다!");
                System.out.println("축하드립니다!!!!");
                break;
            }
        }
        scanner.close();
        System.out.println("게임을 종료합니다.");
    }
}