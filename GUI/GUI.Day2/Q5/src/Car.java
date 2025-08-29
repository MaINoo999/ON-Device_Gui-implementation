public class Car {
    // 1. 멤버 변수 선언
    String model; // 자동차 모델명
    String color; // 자동차 색상
    int speed;    // 현재 속도 (km/h)

    // 2-1. 기본 생성자
    public Car() {
        this.model = "모델 없음";  // 기본 모델명 설정
        this.color = "흰색";      // 기본 색상 설정
        this.speed = 0;           // 초기 속도는 0
    }

    // 2-2. 모델명만 받는 생성자
    public Car(String model) {
        this.model = model;       // 전달받은 모델명으로 설정
        this.color = "검정색";     // 기본 색상은 검정
        this.speed = 0;           // 초기 속도는 0
    }

    // 2-3. 모든 속성을 받는 생성자
    public Car(String model, String color, int speed) {
        this.model = model;       // 전달받은 모델명 설정
        this.color = color;       // 전달받은 색상 설정
        this.speed = speed;       // 전달받은 속도 설정
    }

    // 3-1. 주행 메서드
    public String drive() {
        // 자동차가 현재 속도로 달리는 문장 반환
        return model + "가 " + speed + "km/h로 달립니다!";
    }

    // 3-2. 정지 메서드
    public String stop() {
        // 자동차가 멈췄다는 문장 반환
        return model + "가 멈췄습니다.";
    }
}
