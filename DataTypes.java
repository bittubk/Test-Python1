import java.util.Scanner;

public class DataTypes {
   public static  void main(String [] args ){
    try{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value: ");
        
        String str = scan.nextLine();

        Integer num = Integer.parseInt(str);

        num = num+100;

        System.out.println("Value: "+num);


       scan.close();
    }
    catch(NumberFormatException ob){
         System.out.print("Number FOrmat Exceptions");
    }
   }
}
