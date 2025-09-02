
// Shape 클래스: 모든 도형의 기본 기능을 정의하는 부모 클래스입니다.
class Shape {
    // draw 메소드: 기본적으로 "도형을 그리다."를 출력합니다.
    public void draw() {
        System.out.println("도형을 그리다.");
    }
}

// Circle 클래스: Shape를 상속받아 원의 특성을 가집니다.
class Circle extends Shape {
    // draw 메소드 재정의(오버라이딩): 원을 그리는 방식으로 변경합니다.
    @Override
    public void draw() {
        System.out.println("원을 그리다.");
    }
}

// Triangle 클래스: Shape를 상속받아 삼각형의 특성을 가집니다.
class Triangle extends Shape {
    // draw 메소드 재정의(오버라이딩): 삼각형을 그리는 방식으로 변경합니다.
    @Override
    public void draw() {
        System.out.println("삼각형을 그리다.");
    }
}
public class Main {
    public static void main(String[] args) {
        //Shape 타입의 배열을 선언합니다. 이 배열에는 Shape 또는 Shape를 상속받는 모든 객체를 담을 수 있습니다.
        Shape[] ss = new Shape[3];

        // 각기 다른 타입의 도형 객체들을 생성합니다.
        Shape s1 = new Shape();     // 순수 Shape 객체
        Shape s2 = new Circle();    // Circle 객체를 Shape 타입 변수에 할당 (업캐스팅)
        Shape s3 = new Triangle();  // Triangle 객체를 Shape 타입 변수에 할당 (업캐스팅)

        // 생성된 객체들을 Shape 배열에 저장합니다.
        ss[0] = s1;
        ss[1] = s2;
        ss[2] = s3;

        // 배열을 순회하며 각 객체의 draw 메소드를 호출합니다.
        // 이때, 실제로 호출되는 draw 메소드는 각 객체의 실제 타입에 따라 결정됩니다 (다형성).
        for(Shape s : ss){ // 배열의 각 요소를 Shape 타입 s로 가져옵니다.
            s.draw(); // s의 실제 객체(Shape, Circle, Triangle)에 따라 해당 draw() 메소드가 실행됩니다.
        }

        /*
         * 예상 실행 결과:
         * 도형을 그리다.
         * 원을 그리다.
         * 삼각형을 그리다.
         */
    }
}