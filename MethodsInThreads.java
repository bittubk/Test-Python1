class X extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            if(i==1) yield();
            System.out.println("\tThread X: i= " +i);
        }
        System.out.println("Exit From Thread X");
    }
}

class Y extends Thread{
    public void run(){
        for(int j=0; j<=5; j++){
            if(j==1) yield();
            System.out.println("\tThread Y: j= " +j);

            if(j==3);
        }
        System.out.println("Exit From Thread Y");
    }
}

class Z extends Thread{
    public void run(){
        for(int k=0; k<=5; k++){
            System.out.println("\tThread Z: k= " +k);

            if(k==1)
            try{
                sleep(1000);
            }
            catch(Exception ex){
                
            }
        }
        System.out.println("Exit From Thread Z");
    }
}


class MethodsInThreads{
    public static void main (String args[]){
        X threadX = new X();
        Y threadY = new Y();
        Z threadZ = new Z();

        System.out.println("Starting Thread X:");
        threadX.start();

        System.out.println("Starting Thread Y:");
        threadY.start();

        System.out.println("Starting Thread Z:");
        threadZ.start();

        System.out.println("End Of Main Thread.");
    }
}