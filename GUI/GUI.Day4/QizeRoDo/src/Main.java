import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();


        for (int i=0; i<7; i++){
            int num = random.nextInt(45)+1;
            System.out.print(num+"\t");
        }
    }
}