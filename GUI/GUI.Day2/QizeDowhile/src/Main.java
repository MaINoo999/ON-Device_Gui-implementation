public class Main {
    public static void main(String[] args) {
        int i = 0x41, j = 0x61;

        do {
            // i, j 값을 문자로 출력하도록 수정
            System.out.println("A~Z출력: "+(char)i);
            System.out.println("a~z: "+(char)j);

            if (i == 0x5A) // 'Z'에 도달하면 종료
                break;
            i++; // i 값 증가

            if (j == 0x7A) // 'z'에 도달하면 종료
                break;
            j++; // j 값 증가
        } while (i <= 0x5A && j <= 0x7A); // 'Z'와 'z'까지 출력
    }
}
