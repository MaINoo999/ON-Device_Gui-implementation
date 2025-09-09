public class Main {
    public static void main(String[] args) {

        // 문자열 리터럴 "hi"를 String 타입 변수 str에 저장
        String str = "hi";
        // int a = 100; → 정수형 변수 선언 및 초기화
        // Object obj = new Object(); → Object 타입의 객체 생성


        // 문자열을 byte 배열로 변환
        // getBytes() 메서드는 문자열을 기본 문자 인코딩(보통 UTF-8)으로 인코딩하여 byte 배열로 반환함
        byte[] bytes1 = str.getBytes(); // 문자열을 바이트 배열로 변환

        // 변환된 바이트 배열의 길이를 출력
        // "hi"는 각각 1바이트씩 총 2바이트(UTF-8 기준)이므로 길이는 2
        System.out.println("bytes1.Length : " + bytes1.length);

        // byte 배열을 다시 문자열로 복원
        // String 생성자에 byte 배열을 전달하면, 해당 바이트 배열을 문자로 디코딩하여 문자열을 생성함
        String str1 = new String(bytes1);

        // 변환된 문자열을 출력 (원래의 문자열과 같아야 함)
        System.out.println("bytes1 -> String: " + str1);

    }
}
