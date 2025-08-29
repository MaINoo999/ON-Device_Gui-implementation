public class Main {
    public static void main(String[] args) {
        // 첫 번째 강아지 객체 생성 (기본 생성자 사용)
        Dog mary = new Dog(); // Dog 클래스의 기본 생성자 호출
        mary.name = "메리";   // name 필드 값을 "메리"로 변경
        System.out.println("메리의 이름: " + mary.name); // 메리의 이름 출력
        System.out.println("메리의 나이 : " + mary.age); // 메리의 나이 출력

        // 두 번째 강아지 객체 생성 (이름만 전달하는 생성자 사용)
        Dog bbobbi = new Dog("뽀삐"); // 이름을 매개변수로 넘김
        System.out.println("뽀삐의 이름: " + bbobbi.name);   // 뽀삐의 이름 출력
        System.out.println("뽀삐의 나이 : " + bbobbi.age);   // 뽀삐의 나이 출력
        System.out.println("뽀삐의 색상: " + bbobbi.color); // 뽀삐의 색상 출력

        // 세 번째 강아지 객체 생성 (나이, 이름, 색상 모두 전달)
        Dog bob = new Dog(5, "밥", "검은색"); // 모든 필드 초기화
        System.out.println("밥의 이름: " + bob.name);     // 밥의 이름 출력
        System.out.println("밥의 나이 : " + bob.age);     // 밥의 나이 출력
        System.out.println("밥의 색상: " + bob.color);    // 밥의 색상 출력

        // 밥 객체가 수행하는 동작 출력 (메서드 호출)
        System.out.println(bob.Run());   // 밥이 뛰는 행동 출력
        System.out.println(bob.Eat());   // 밥이 먹는 행동 출력
        System.out.println(bob.Bark());  // 밥이 짖는 행동 출력
    }
}
