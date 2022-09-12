public class Twodimensionalarray {
    
    public static void main(String [] args){
        int arr[][] = {
            {1,2},
            {2,3},
            {3,4}
        };

        System.out.print("Array is: \n");

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(arr[i][j] +" ");
            }
        }

    }

}