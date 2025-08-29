public class Main {
    public static void main(String[] args) {
        int i = 1;  // 변수 i를 1로 초기화

        do {
            System.out.print(i + " ");  // i 값을 출력 (공백을 추가해서 출력)

            if (i == 50)  // i가 50일 경우
                break;  // 루프를 종료 (50에서 멈춤)

            i++;  // i 값을 1 증가시킴
        } while (i <= 100);  // i가 100 이하일 경우에만 반복
    }
}
