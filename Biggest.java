import java.util.Scanner;
public class Biggest {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("You have to enter 3 numbers to find out biggest between them.");

        System.out.print("Enter first number: ");
        float n1 = in.nextFloat();

        System.out.print("Enter second number: ");
        float n2 = in.nextFloat();

        System.out.print("Enter third number: ");
        Float n3 = in.nextFloat();

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the biggest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the biggest number.");

        else
            System.out.println(n3 + " is the biggest number.");

        in.close();
    }
    
}
