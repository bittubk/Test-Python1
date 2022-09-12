import java.util.Scanner;

public class Twodimensionalarry {

    public static void inputArray(int a[][] ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input to add values: ");
        for(int i=0; i<a.length; i++)
            for(int j=0; j<a.length; j++){
                System.out.print("enter element: ");
                a[i][j] = scan.nextInt();
            }

            scan.close();

    }

    public static void main(String [] args){
        int arr[][] = new int [3][];
        arr[0] = new int [5];
        arr[1] = new int [7];
        arr[2] = new int [3];
        
        inputArray (arr);
        
        System.out.println("Array is: \n");

        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j< arr[i].length; j++)
            {
                System.out.print(arr[i][j] +" ");
            }
        }

    }

}