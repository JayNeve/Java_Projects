import java.util.Scanner;

public class complexTwoDArray {
    public static int[][] multiArray;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        multiArray = new int[rows][];
        
        for(int i=0; i<rows; i++){
            System.out.print("Enter the number of columns for row " + (i+1) + ": ");
            int cols = scanner.nextInt();
            multiArray[i] = new int[cols];
        }
        System.out.println("The 2D array is:");
        for(int i=0; i<multiArray.length; i++){
            for(int j=0; j<multiArray[i].length; j++){
                System.out.print("[]"+ " ");
            }
            System.out.println();
        }
        
        scanner.close();

    }
}
