//객체의 설계도
class Car
{
    //1. 멤버 변수
    String brand;
    int speed;
    String color;

    //2. 생성자
    Car() {} //디폴트 생성자.
    Car(String brand)
    {
        this.brand = brand;
    }
    Car(int speed, String brand)
    {
        this.speed = speed;
        this.brand = brand;
    }

    //3. 멤버 메소드
    public void Run()
    {
        System.out.println("차가 달리다~!!!");
    }
}
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main
{
    public static void main(String[] args)
    {
        Car dori = new Car();
        dori.Run();
        System.out.println("자동차 브랜드 : " + dori.brand);

        Car myCar = new Car(100, "BMW");
        myCar.Run();
        System.out.println("자동차 스피드 : " + myCar.speed);
        System.out.println("자동차 브랜드 : " + myCar.brand);

    }
}