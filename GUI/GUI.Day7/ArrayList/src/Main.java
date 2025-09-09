import java.util.ArrayList;

class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Person 객체를 저장할 ArrayList 생성
        ArrayList<Person> people = new ArrayList<>();

        // 3명의 Person 객체 추가
        people.add(new Person("홍길동"));
        people.add(new Person("김철수"));
        people.add(new Person("이영희"));

        // 모든 사람의 이름 출력
        for (Person person : people) {
            System.out.println(person.getName());
        }

        // <<김철수 삭제 후>>
        System.out.println("\n<<김철수 삭제 후>>");

        // 이름이 "김철수"인 객체 삭제
        people.removeIf(person -> person.getName().equals("김철수"));

        // 현재 인원 수 출력
        System.out.println("현재 인원 수: " + people.size());

        // 남은 사람의 이름 출력
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
