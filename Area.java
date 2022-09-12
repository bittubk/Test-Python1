import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a radius of a circle: ");
        float r = in.nextFloat();

        final float pi = 3.1416f;
        
        float s = pi*r*r;

        System.out.println("Area of a circle is: "+s);

        in.close();
        
    }
}