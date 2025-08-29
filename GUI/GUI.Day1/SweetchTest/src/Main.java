import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String strValue;
        Scanner sc = new Scanner(System.in);
        System.out.print("0~6 숫자 1개 입력 : ");
        strValue = sc.next(); // 문자열 입력

        switch(strValue){
            case "0":
                System.out.println("월.");
                break;

            case "1":
                System.out.println("화.");
                break;

            case "2":
                System.out.println("수.");
                break;

            case "3":
                System.out.println("목.");
                break;

            case "4":
                System.out.println("금.");
                break;

            case "5":
                System.out.println("토.");
                break;

            case "6":
                System.out.println("일.");
                break;

            default:
                System.out.println("숫자를 입력 바람");
        }

        sc.close();
    }
}
