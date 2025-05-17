import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PercentageCalc {
    public static void main(String[] args)throws  Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the obtained marks: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter the total marks: ");
        int b = Integer.parseInt(reader.readLine());

        int Percent = a * 100 / b;
        if (Percent >= 80 && Percent <= 100) {
            System.out.println("You have obtained " + Percent + "% ");
            System.out.println();
            System.out.println("Congratulations! You have been awarded with the grade 'A'");
        } 

        else if (Percent >= 60 && Percent <= 79) {
            System.out.println("You have obtained " + Percent + "% ");
            System.out.println();
            System.out.println("Congratulations! You have been awarded with the grade 'B'");
        } 

        else if (Percent >= 35 && Percent <= 59) {
            System.out.println("You have obtained " + Percent + "% ");
            System.out.println();
            System.out.println("Congratulations! You have been awarded with the grade 'C'");
        }

        else{
            System.out.println("You have obtained " + Percent + "% ");
            System.out.println();
            System.out.println("You have been Failed!");
        }
    }
}