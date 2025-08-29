public class Dog {
    // 1. 멤버 변수 선언 (강아지의 특성)
    String name;   // 이름
    int age;       // 나이
    String color;  // 색상

    // 2. 기본 생성자 - 매개변수 없이 객체 생성할 때 호출됨
    Dog() {
        this.name = "강아지";      // 기본 이름
        this.age = 3;              // 기본 나이
        this.color = "누런색";     // 기본 색상
    }

    // 3. 이름만 받는 생성자 - 나머지는 기본값으로 설정
    Dog(String name) {
        this.name = name;          // 전달받은 이름 저장
        this.age = 2;              // 기본 나이
        this.color = "누런색";     // 기본 색상
    }

    // 4. 모든 필드를 초기화하는 생성자
    Dog(int age, String name, String color) {
        this.age = age;            // 전달받은 나이 저장
        this.name = name;          // 전달받은 이름 저장
        this.color = color;        // 전달받은 색상 저장
    }

    // 강아지가 뛰는 동작
    String Run() {
        return "뛰어"; // 동작 문자열 반환
    }

    // 강아지가 먹는 동작
    String Eat() {
        return "냠"; // 동작 문자열 반환
    }

    // 강아지가 짖는 동작
    String Bark() {
        return "왈멍"; // 동작 문자열 반환
    }
}
