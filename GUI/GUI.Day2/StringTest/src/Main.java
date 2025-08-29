public class Main {
    public static void main(String[] args) {
        // 문자열 str1 생성
        String str1 = "자바 프로그래밍";

        // "자바"를 "JAVA"로 변경하여 새 문자열 생성
        String newStr = str1.replace("자바", "JAVA");

        // 변경된 문자열의 길이를 출력
        System.out.println("문자열 길이 : " + newStr.length());

        // 문자열의 각 문자(char)를 한 줄씩 출력
        for (int i = 0; i < newStr.length(); i++) {
            System.out.print(newStr.charAt(i));
        }

        // 주민등록번호 형식의 문자열 str2 생성
        String str2 = "991230-1234567";

        // 인덱스 2부터 끝까지 출력 ("1230-1234567")
        System.out.println(str2.substring(2));

        // 인덱스 2부터 6 전까지 출력 ("1230")
        System.out.println(str2.substring(2, 6));
    }
}
