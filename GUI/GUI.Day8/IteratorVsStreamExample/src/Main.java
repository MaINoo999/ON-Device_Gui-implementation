 // 필요한 클래스들을 import 합니다.
// Arrays: 배열을 리스트로 바꾸는 데 사용
// Iterator: 컬렉션을 반복(iterate)할 때 사용
// List: 리스트 컬렉션 인터페이스
// Stream: 자바 8부터 도입된 데이터 처리용 API
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

// 클래스 정의
public class Main {

    // main 메서드: 자바 애플리케이션의 시작점
    public static void main(String[] args) {

        // 문자열을 요소로 갖는 리스트 생성
        // Arrays.asList()를 사용하여 배열을 리스트로 변환합니다.
        List<String> list = Arrays.asList("홍길동", "신용권", "감자바");

        // ===== Iterator 사용 =====

        // 리스트로부터 Iterator 객체를 얻습니다.
        // Iterator는 컬렉션을 반복(iterate)해서 하나씩 처리할 수 있도록 해주는 객체입니다.
        Iterator<String> iterator = list.iterator();

        // hasNext(): 다음 요소가 존재하는지 확인 (true/false 반환)
        // next(): 다음 요소를 가져옴
        while (iterator.hasNext()) {
            String name = iterator.next(); // 다음 요소를 가져와 name 변수에 저장
            System.out.println(name); // 요소 출력
        }

        System.out.println(); // 줄바꿈을 위해 공백 출력

        // ===== Stream 사용 =====

        // 리스트로부터 스트림을 생성
        // 스트림은 데이터 소스를 추상화하여, 선언적 방식으로 데이터를 처리할 수 있게 해줍니다.
        Stream<String> stream = list.stream();

        // forEach(): 스트림의 각 요소에 대해 주어진 작업을 수행
        // 여기서는 람다식을 사용하여 각 요소를 콘솔에 출력합니다.
        stream.forEach(name -> System.out.println(name));
    }
}
