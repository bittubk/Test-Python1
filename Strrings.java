public class Strrings{

    public static void upperCase(String[] arr){

        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i].toUpperCase();
        }

    }

    public static void sorting(String[] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j].compareTo(arr[i])>0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
 
    }

    public static void length(String[] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i].length()<arr[j].length()){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sortLastCharacter(String[] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i].charAt(arr[i].length()-1)<arr[j].charAt(arr[j].length()-1)){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void print(String[] arr){
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args){

        String s1[] = {"Good", "Morning", "And", "Hello", "To", "All"};
        
        upperCase(s1);
        sorting(s1);
        length(s1);
        sortLastCharacter(s1);
        print(s1);
    }

}