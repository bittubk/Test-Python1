import java.util.Scanner;

public class InputOutput{
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String s = s1.nextLine();

        System.out.print(s.toUpperCase());

        System.out.println("\nEntered String was: " + s);
        s1.close();
    }
}