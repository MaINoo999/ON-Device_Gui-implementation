import java.util.ArrayList;

// Animal 클래스: 모든 동물의 공통 조상 클래스입니다.
// 'makeSound()' 메서드를 추상 메서드로 선언하여, 각 동물마다 다르게 구현하도록 강제합니다.
abstract class Animal {
    // 모든 동물이 반드시 자신만의 소리를 내도록 추상 메서드로 정의합니다.
    abstract void makeSound();
}

// Dog 클래스: Animal 클래스를 상속받아 개의 울음소리를 구현합니다.
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("멍멍!"); // 개의 울음소리
    }
}

// Cat 클래스: Animal 클래스를 상속받아 고양이의 울음소리를 구현합니다.
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("야옹~"); // 고양이의 울음소리
    }
}

// Cow 클래스: Animal 클래스를 상속받아 소의 울음소리를 구현합니다.
class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("음메~"); // 소의 울음소리
    }
}

// Main 클래스: 프로그램의 시작점입니다.
public class Main {
    public static void main(String[] args) {
        // Animal 타입을 담을 수 있는 ArrayList를 생성합니다.
        // 이 리스트는 다양한 종류의 동물을 하나의 타입(Animal)으로 저장할 수 있습니다.
        ArrayList<Animal> animals = new ArrayList<>();

        // 리스트에 다양한 동물 객체(Dog, Cat, Cow)를 추가합니다.
        // 각 객체는 Animal 타입으로 업캐스팅되어 저장됩니다.
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        // 리스트를 반복하면서 각 동물의 makeSound() 메서드를 호출합니다.
        // 이 때, 실제 객체(Dog, Cat, Cow)에 따라 다른 메서드가 호출되는 것이 '다형성(polymorphism)'입니다.
        for (Animal animal : animals) {
            animal.makeSound(); // 실제 객체에 맞는 makeSound()가 실행됩니다.
        }
    }
}
