import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 구구단 숫자 입력: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println(n+"단 출력");

        for(int i=1; i<=9; i++){
            System.out.print(n+"x"+i+"="+(n*i)+" ");

        for(int j=1; j>=9; j++){
            for(int k=1; k<=9; k++){
                String str = String.format("%d x %d = %d",j,k,j*k);
                System.out.print(str);
                }
            }
        }
    }
}