// 고양이 설계도
class Cat{
    // 고양이의 특징들 (이름, 나이, 색깔)
    String name;
    int age;
    String color;

    // 1. 고양이를 만드는 방법 (생성자)
    Cat() {} // 아무것도 정해주지 않고 만드는 기본 고양이

    Cat(String name, int age){ // 이름과 나이를 정해서 만드는 고양이
        this.name = name;
        this.age = age;
    }
    Cat(String name, int age, String color){ // 이름, 나이, 색깔
        this.name = name;
        this.age = age;
        this.color = color;
    }

    Cat(int age, String color){
        this.age = age;
        this.color = color;
    }

    // 2. 고양이가 할 수 있는 행동들 (메소드)
    public void Meow() { // 야옹! 소리내는 행동
        System.out.println("야옹");
    }
    public void Eat() { // 냠냠 먹는 행동
        System.out.println("냠냠");
    }
}

public class Main {
    public static void main(String[] args)
    {
        Cat Mir = new Cat(); // 미르 고양이 탄생 (이름/나이/색깔은 아직 없어)
        Mir.Meow(); // 미르가 야옹
        System.out.println("미르 울음소리"); // "미르 울음소리" 출력

        // 나이는 3살, 색깔은 빨강 (이제 이 생성자가 설계도에 있어서 실행)
        Cat myCat = new Cat(3,"red");
        myCat.Meow(); // 내 고양이도 야옹!
        System.out.println("미르 나이: "+myCat.age); // 3이 출력.
        System.out.println("미르 색깔: "+myCat.color); // red가 출력

    }
}