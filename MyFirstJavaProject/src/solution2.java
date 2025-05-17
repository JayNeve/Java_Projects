import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int counterP = 0;
        int counterN = 0;
        {
            if(a > 0)
                counterP++;
            if(b > 0)
                counterP++;
            if(c > 0)
                counterP++;
            System.out.println("Positive: " + counterP);
        }
        {
            if(a < 0)
                counterN++;
            if(b < 0)
                counterN++;
            if(c < 0)
                counterN++;
            System.out.println("Negative: " + counterN);
        }
    }
}
