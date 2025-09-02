// Shape 클래스: 모든 도형의 기본 기능을 정의합니다.
class Shape {
    // draw 메소드: 도형을 그리는 기능을 수행합니다.
    public void draw() {
        System.out.println("도형을 그리다.");
    }
}

// Rectangle 클래스: Shape를 상속받아 사각형 기능을 추가합니다.
class Rectangle extends Shape {
    // draw 메소드 재정의: 사각형에 맞게 그리는 방식을 변경합니다.
    @Override
    public void draw() {
        System.out.println("사각형을 그리다.");
    }
}

// Circle 클래스: Shape를 상속받아 원 기능을 추가합니다.
class Circle extends Shape {
    // draw 메소드 재정의: 원에 맞게 그리는 방식을 변경합니다.
    @Override
    public void draw() {
        System.out.println("원을 그리다.");
    }
}

// Triangle 클래스: Shape를 상속받아 삼각형 기능을 추가합니다.
class Triangle extends Shape {
    // draw 메소드 재정의: 삼각형에 맞게 그리는 방식을 변경합니다.
    @Override
    public void draw() {
        System.out.println("삼각형을 그리다.");
    }
}
public class Main {
    public static void main(String[] args) {
        // 기본 도형 객체 생성 및 그리기
        Shape s = new Shape();
        s.draw();

        // 사각형 객체 생성 및 그리기
        Rectangle rec = new Rectangle();
        rec.draw();

        // 원 객체 생성 및 그리기
        Circle cir = new Circle();
        cir.draw();

        // 삼각형 객체 생성 및 그리기
        Triangle tri = new Triangle();
        tri.draw();
    }
}