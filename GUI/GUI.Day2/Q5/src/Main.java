//클래스 자유롭게 만들어 보세요.
//정해지지 않았다면 Car 클래스를 만들어 보세요.
//만들어야 되는 것.
//1. 멤버 변수 3개 이상
//2. 생성자 3개 이상 - 디폴트 생성자, 인자가 있는 생성자
//3. 메소드 2개 이상 작성!!!
//Main 함수에서 객체를 테스트해 봅니다.

public class Main {
    public static void main(String[] args) {

        // 기본 생성자로 객체 생성
        Car car1 = new Car(); // 모델 없음, 흰색, 속도 0
        System.out.println(car1.drive()); // 주행 메서드 호출
        System.out.println(car1.stop());  // 정지 메서드 호출

        // 모델명만 주는 생성자로 객체 생성
        Car car2 = new Car("소나타"); // 소나타, 검정색, 속도 0
        System.out.println(car2.drive()); // 주행
        System.out.println(car2.stop());  // 정지

        // 모델명, 색상, 속도 모두 지정
        Car car3 = new Car("테슬라", "빨강", 120); // 테슬라, 빨강, 120km/h
        System.out.println(car3.drive()); // 주행
        System.out.println(car3.stop());  // 정지
    }
}

