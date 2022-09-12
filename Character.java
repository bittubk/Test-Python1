import java.util.Scanner;
public class Character{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Give input to check either inputted value is character or not: ");
        
        char ch = in.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println(ch + " is an character.");
        else
            System.out.println(ch + " is not an character.");

        in.close();
    }
}