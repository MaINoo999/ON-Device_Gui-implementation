

class Car{

    String brand;
    int speed;
    String colir;
    // 생성자
    Car()
    {

    }
    // 인자 , 매개변수 , 파라미터 등이 있는 생성자
    Car(String brand, int speed, String colir){
        this.brand = brand;
        this.speed = speed;
        this.colir = colir;
    }

    public  void Run(){
        System.out.println("차가 달린다");
    }

public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        System.out.println(myCar1.speed);
        Car myCar2 = new Car("현대",240,"하얀색");
        System.out.println(myCar2.speed);
        }
    }
}