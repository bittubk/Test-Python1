class E extends Thread{
    public void run(){
        System.out.println("threadE started: ");
        for(int i=0; i<=4; i++){
            System.out.println("\tfrom Thread E: i = " +i);
        }
        System.out.println("exit from E");
    }
}

class F extends Thread{
    public void run(){
        System.out.println("threadF started: ");
        for(int k=0; k<=4; k++){
            System.out.println("\tfrom Thread F: i = " +k);
        }
        System.out.println("exit from F");
    }
}

class G extends Thread{
    public void run(){
        System.out.println("threadG started: ");
        for(int j=0; j<=4; j++){
            System.out.println("\tfrom Thread G: i = " +j);
        }
        System.out.println("exit from G");
    }
}

class ThreadsPriority{
    public static void main(String [] args) {
        E threadE = new E();
        F threadF = new F();
        G threadG = new G();

        threadE.setPriority(Thread.MAX_PRIORITY);
        threadF.setPriority(Thread.NORM_PRIORITY);
        threadG.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start thread E: ");
        threadE.start();

        System.out.println("Start thread F: ");
        threadF.start();

        System.out.println("Start thread G: ");
        threadG.start();

        System.out.println("End Of Main Thread.");
    }
}