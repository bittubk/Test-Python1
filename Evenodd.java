import java.util.Scanner;

public class Evenodd {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to check either it even or odd: ");
        int numb = in.nextInt();

        if(numb%2==0)
            System.out.println(numb + " is a even number!");
        else
            System.out.println(numb + " is a odd number!");

        in.close();
    }   
}