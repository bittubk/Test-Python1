import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
    
            Scanner in = new Scanner(System.in);

            System.out.print("Enter first number: ");
            float n1 = in.nextFloat();

            System.out.print("Enter second number: ");
            float n2 = in.nextFloat();
    
            System.out.println("--Before swapping--");
            System.out.println("First number: " + n1);
            System.out.println("Second number: " + n2);
    
            float temp = n1;
            n1 = n2;
            n2 = temp;
    
            System.out.println("--After swapping--");
            System.out.println("First number: " + n1);
            System.out.println("Second number: " + n2);

            in.close();
        }
    }