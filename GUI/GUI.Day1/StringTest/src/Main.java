// Byte 클래스를 사용하기 위해 java.lang.Byte 패키지를 임포트
import java.lang.Byte;

public class Main {
    public static void main(String[] args) {

        // 문자열 "10"을 정의
        String str = "10";
        // 문자열 "10"을 byte 형으로 변환
        byte value = Byte.parseByte(str);
        // 변환된 byte 값을 출력
        System.out.println(value);

        // 문자열 "200"을 정의
        String str2 = "200";
        // 문자열 "200"을 short 형으로 변환
        short value2 = Short.parseShort(str2);

        // 문자열 "홍길동"을 정의 (리터럴 사용)
        String strVar1 = "홍길동";
        // 동일한 리터럴 "홍길동"을 다시 정의
        String strVar2 = "홍길동";
        // new 연산자를 사용하여 새로운 String 객체를 생성
        String strVar3 = new String("홍길동");

        // strVar1과 strVar2는 동일한 리터럴 "홍길동"을 참조하므로, 동일한 객체를 참조
        System.out.println(strVar1 == strVar2);  // true 출력

        // strVar3은 new 키워드로 생성된 새로운 String 객체이므로, 다른 메모리 주소를 가짐
        System.out.println(strVar1 == strVar3);  // false 출력

        System.out.println();  // 한 줄 띄우기 (출력의 가독성)

        // 문자열 내용 비교: strVar1과 strVar2의 내용이 동일한지 비교
        System.out.println(strVar1.equals(strVar2));  // true 출력
        // 문자열 내용 비교: strVar1과 strVar3의 내용이 동일한지 비교
        System.out.println(strVar1.equals(strVar3));  // true 출력
    }
}
