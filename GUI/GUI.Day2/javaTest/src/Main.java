class Calculator {

    // 생성자 정의 (현재는 따로 기능이 없지만 작성)
    Calculator() {
    }

    // 덧셈 메서드
    public static int plus(int a, int b) {
        return a + b;
    }

    // 뺄셈 메서드
    public static int minus(int a, int b) {
        return a - b;
    }

    // 곱셈 메서드
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 나눗셈 메서드 (소수점 결과를 위해 double로 변경)
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double) a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 7;

        // 객체 없이 클래스 이름으로 static 메서드 호출
        System.out.println("덧셈: " + Calculator.plus(a, b));
        System.out.println("뺄셈: " + Calculator.minus(a, b));
        System.out.println("곱셈: " + Calculator.multiply(a, b));
        System.out.println("나눗셈: " + Calculator.divide(a, b));
    }
}
