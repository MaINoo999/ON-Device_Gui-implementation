import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//유용한 유틸리티 클래스
//Collections, Arrays

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "이순신", "강감찬");

        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i)+"\t");

        Collections.sort(list);
        System.out.println();
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i)+"\t");

        int[] arr = {5, 4, 3, 2, 1};
        Arrays.sort(arr);

        System.out.println();
        for(int i : arr){
            System.out.print(i + "\t");
        }
    }
}