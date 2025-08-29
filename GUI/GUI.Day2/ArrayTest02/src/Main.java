
public class Main {
    public static void main(String[] args) {

        int[][] score1 = new int[2][3]; //y축, x축
        int[][] score2 = {
                {1,2,3},{4,5,6}
        };
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(score2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}