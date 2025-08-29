public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "JAVA";                         // 문자열 리터럴 (상수풀에 저장)
        strArray[1] = "JAVA";                         // 같은 리터럴, 상수풀에서 재사용됨
        strArray[2] = new String("JAVA");             // new 키워드 사용 → 새로운 객체 생성

        System.out.println(strArray[0] == strArray[1]);   // true (같은 리터럴 → 같은 참조)
        System.out.println(strArray[0] == strArray[2]);   // false (새 객체이므로 참조 다름)
        System.out.println(strArray[0].equals(strArray[2])); // true (값이 같으므로 true)

        // 참고: 아래 주석된 부분은 배열 출력용, 문제 없음
        // for (String s : strArray) {
        //     System.out.println(s);
        // }
    }
}
