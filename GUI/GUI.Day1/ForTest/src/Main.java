// TIP: 코드를 실행하려면 'Run' 단축키를 누르거나
// 에디터 왼쪽 여백에 있는 실행 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        // 1부터 99까지 반복
        for (int i = 1; i < 100; i++) {

            // 현재 i 값을 출력
            System.out.print(i + " ");

            int j = 1;
            // 1부터 100까지 출력하는 while문
            while (j <= 100) {
                System.out.print(j + " ");
                j++;
            }
            // 한 줄 끝나고 줄바꿈
            System.out.println();
        }
    }
}
