/**
 * @file 핸드폰 상속 예제
 * @brief 부모-자식 클래스 관계에서 생성자 호출 순서 및 필드 초기화를 보여줍니다.
 */

// Phone 클래스: 부모 클래스, 일반 핸드폰의 기본 기능을 정의합니다.
class Phone {
    public String model; // 핸드폰 모델 (예: "핸드폰", "삼성")
    public String color; // 핸드폰 색상 (예: "검은색")

    // Phone 클래스의 생성자: Phone 객체가 만들어질 때 실행됩니다.
    public Phone() {
        System.out.println("Phone() 생성자가 실행!"); // 이 메시지가 먼저 출력됩니다.
        model = "핸드폰"; // 기본 모델은 "핸드폰"으로 설정
        color = "검은색"; // 기본 색상은 "검은색"으로 설정
    }

    // run 메소드: 핸드폰이 동작하는 기능을 정의합니다.
    public void run() {
        System.out.println("핸드폰이 동작한다.");
    }
}

// SmartPhone 클래스: Phone 클래스를 '상속'받는 자식 클래스, 스마트폰의 기능을 추가합니다.
// extends Phone: Phone의 모든 특성(필드, 메소드)을 물려받습니다.
class SmartPhone extends Phone {
    // SmartPhone 클래스의 생성자: SmartPhone 객체가 만들어질 때 실행됩니다.
    public SmartPhone() {
        //자식 클래스의 생성자가 호출될 때, 항상 부모 클래스의 기본 생성자(Phone())가 먼저 자동으로 호출됩니다
        System.out.println("SmartPhone() 생성자 실행!"); // Phone() 생성자 실행 후 이 메시지가 출력됩니다.
        this.model = "삼성"; // 자식 클래스에서 모델을 "삼성"으로 '다시 설정'합니다.
        // 부모 클래스에서 "핸드폰"으로 초기화되었지만, 여기서 "삼성"으로 변경됩니다.
    }
}

/**
 * @class Main
 * @brief 프로그램의 시작점입니다.
 *        SmartPhone 객체를 생성하고, 상속된 필드와 메소드를 확인합니다.
 */
public class Main {
    public static void main(String[] args) {
        // SmartPhone 객체 'myPhone'을 생성합니다.
        // 이때 Phone() 생성자가 먼저 실행되고, 이어서 SmartPhone() 생성자가 실행됩니다.
        SmartPhone myPhone = new SmartPhone();

        // myPhone의 색상을 출력합니다. (Phone 클래스에서 물려받은 '검은색'이 나옵니다.)
        System.out.println(myPhone.color);

        // myPhone의 모델을 출력합니다. (SmartPhone 클래스에서 재설정된 '삼성'이 나옵니다.)
        System.out.println(myPhone.model);

        // myPhone의 run 메소드를 호출합니다. (Phone 클래스에서 물려받은 기능입니다.)
        myPhone.run();
    }
}