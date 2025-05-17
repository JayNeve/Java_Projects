import java.io.BufferedReader;
import java.io.InputStreamReader;

public class chessboard {
    public static char[][] array;

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the chessboard: ");
        int n = Integer.parseInt(reader.readLine());
        char[][] array = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if((i+j)%2 == 0){
                    array[i][j] = '#';
                }else{
                    array[i][j] = ' ';
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
