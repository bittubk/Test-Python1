class Running implements Runnable{
    public void run(){
        for (int i=1; i<=10; i++){
            System.out.println("\tThreadX : " + i);
        }
        System.out.println("End of threadX");
    }
}


public class RunnableTest {
    public static void main(String args[]) {
        X Runnable = new X();
        Thread threadX = new Thread (Runnable);
        threadX.start();
        System.out.println("End Of Main Thread");
    }    
}