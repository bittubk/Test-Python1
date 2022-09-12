import java.util.Scanner;
public class Average{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter secind number: ");
        int b = in.nextInt();

        float c = (float) (a+b)/2;

        System.out.println("Average of entered number is: "+c);

        in.close();
    }
}