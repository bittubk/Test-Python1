import java.io.*;

public class BytesToFileIo {
    public static void main(String[] args) {
        byte cities[] = {'P', 'U', 'N', 'J', 'A', 'B', '\n', 'D', 'E', 'L', 'H', 'I', '\n', 'H', 'A', 'R', 'Y', 'A', 'N', 'A'};    
    

    FileOutputStream outFile = null;
    try{
        outFile = new FileOutputStream ("city.txt");

        outFile.write (cities);
        outFile.close ();
    }
    catch (IOException ioe){
        System.out.println(ioe);
        System.exit(-1);
    }
}
}