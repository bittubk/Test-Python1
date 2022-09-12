class I extends Thread{
    public void run(){
        System.out.println("This is thread: I\t Thread Id: " + Thread.currentThread().getId() +" \tThread Priority: "+Thread.currentThread().getPriority());
    }
}

class J extends Thread{
    public void run(){
        System.out.println("This is thread: J\t Thread Id: " + Thread.currentThread().getId() +" \tThread Priority: "+Thread.currentThread().getPriority());
    }
}

class K extends Thread{
    public void run(){
        System.out.println("This is thread: K\t Thread Id: " + Thread.currentThread().getId() +" \tThread Priority: "+Thread.currentThread().getPriority());
    }
}

class ThreadIdPriority{
    public static void main(String args[]){
        I threadI = new I();
        J threadJ = new J();
        K threadK = new K();

        threadI.setPriority(Thread.MIN_PRIORITY);
        threadJ.setPriority(Thread.NORM_PRIORITY);
        threadK.setPriority(Thread.MAX_PRIORITY);

        System.out.println("\nThis is the main Thread: \tThread ID: " +Thread.currentThread().getId()+"\tThread Priority: "+Thread.currentThread().getPriority()+"\n");

        System.out.println("Let's call the other threads in the sequence I->K->L \n");

        threadI.start();
        threadJ.start();
        threadK.start();
    }
}