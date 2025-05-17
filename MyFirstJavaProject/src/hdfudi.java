import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hdfudi {
	public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter numbers to sum (enter -1 to stop):");
        int sum = 0;
        while(true){
            int a =  Integer.parseInt(reader.readLine());
            sum += a;
        if (a == -1) {
            break;
        }
        }
        System.out.println("Sum = " + sum);
    } 
}