import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args)throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first number:");
        int a = Integer.parseInt(reader.readLine());

        System.out.print("Enter the second number:");
        int b = Integer.parseInt(reader.readLine());

        System.out.print("Choose charecter between ( + , - , * , / , % , ^ ):");
        char choose = reader.readLine().toCharArray()[0];
    
        if (choose == '+'){
            System.out.println("The sum of the two numbers is: " + (a+b));
        }
        else if(choose == '-'){
            System.out.println("The difference between the two numbers is: " + (a-b));
        }
        else if(choose == '*'){
            System.out.println("The product of the two numbers is: " + (a * b));
        }
        else if(choose == '/'){
            if (b == 0) {
                System.out.println("You cannot divide by zero!");
            }
            else {
                System.out.println("The quotient of the two numbers is: " + (a / b));
            }
        }
        else if(choose == '^'){
            System.out.println("The result of the two numbers is: " + Math.pow(a, b));
        }
        else if(choose == '%'){
            System.out.println(b + "% of "+ a + " is equal to: " + (a*b/100));
        }
        else{
            System.out.println(choose + " is not valid! Please try again...");
        }
        reader.close();
    }
}

