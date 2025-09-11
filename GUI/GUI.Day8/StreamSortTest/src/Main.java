// 다양한 유틸리티 클래스 및 인터페이스 import
import java.util.Arrays;                 // 배열을 리스트로 변환하거나 스트림 생성에 사용
import java.util.Comparator;            // 정렬 기준 제공 인터페이스
import java.util.List;                  // 리스트 인터페이스
import java.util.stream.IntStream;      // 기본형 int 전용 스트림
import java.util.stream.Stream;         // 객체 스트림

// Student 클래스 정의 - Comparable 인터페이스를 구현하여 객체 간 정렬 가능하도록 설정
class Student implements Comparable<Student>
{
    private String name;     // 이름 필드
    private int score;       // 점수 필드

    // 생성자 - 이름과 점수를 초기화
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Getter: 이름 반환
    public String getName() {
        return name;
    }

    // Getter: 점수 반환
    public int getScore() {
        return score;
    }

    // Comparable 인터페이스 구현 메서드: 점수를 기준으로 정렬할 수 있도록 설정
    @Override
    public int compareTo(Student s) {
        // this.score < s.score 이면 음수 반환 (오름차순)
        return Integer.compare(score, s.score);
    }
    // 즉, 점수 기준 오름차순 정렬을 의미
}

public class Main {
    public static void main(String[] args) {

        // ===== 기본형 정수 배열을 IntStream으로 처리 =====
        IntStream stream = Arrays.stream(new int[] {5, 4, 3, 2, 1});

        // 오름차순 정렬하여 출력
        stream.sorted().forEach(i -> System.out.print(i + " "));
        // 출력 결과: 1 2 3 4 5
        System.out.println(); // 줄바꿈

        // ===== 사용자 정의 객체 리스트 생성 =====
        List<Student> list = Arrays.asList(
                new Student("홍길동", 50),
                new Student("이순신", 100),
                new Student("강감찬", 90)
        );

        // ===== 오름차순 정렬 =====
        // Student 클래스에 구현된 compareTo() 기준 (score 오름차순)
        list.stream()
                .sorted() // compareTo() 사용
                .forEach(s -> System.out.println(s.getName() + "/" + s.getScore()));
        // 출력:
        // 홍길동/50
        // 강감찬/90
        // 이순신/100

        // ===== 내림차순 정렬 =====
        list.stream()
                .sorted(Comparator.reverseOrder()) // compareTo() 기준을 역순으로 정렬
                .forEach(s -> System.out.println(s.getName() + "/" + s.getScore()));
        // 출력:
        // 이순신/100
        // 강감찬/90
        // 홍길동/50
    }
}
