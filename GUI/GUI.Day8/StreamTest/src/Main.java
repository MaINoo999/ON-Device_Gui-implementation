import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("홍길동", "이순신", "강감찬");

        for(String name : list){
            System.out.println(name);
        }

        System.out.println();

        Stream<String> stream = list.stream();
        stream.forEach(name ->System.out.println(name));

    }
}