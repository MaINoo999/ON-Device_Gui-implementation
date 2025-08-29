public class Main {

    public static void main(String[] args) {
        int[] scores;   // 참조 변수 선언
        scores = new int[] {100, 90, 90}; // 배열 객체 생성 및 초기화

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]+"\t");
        }
        System.out.println();
          }
}
