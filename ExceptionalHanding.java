public class ExceptionalHanding {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        int c = 5;
        int y;

        try{ 
        }

        catch (ArithmeticException e){
            System.out.println("Division by zero");
        }

        y = a/(b+c);
        System.out.println("y = " + y);
    }
}