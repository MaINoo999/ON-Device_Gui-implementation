class Calculator{
    public static  double pi = 3.141592;

    public static int plus(int x, int y){
        return x+y;
    }
    public static int minus(int x, int y){
        return x-y;
    }
}


public class Main {
    public static void main(String[] args) {

        double result1 = Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);
        System.out.println(result3);

    }
}