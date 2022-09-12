import java.io.*;

public class BytesFromFileIo {
    public static void main(String[] args) {
        FileInputStream infile = null;
        int b;

        try{
            infile = new FileInputStream(args [0]);

            while ( (b = infile.read() )!= -1){
                System.out.print( (char) b);
            }
            infile.close();
        }

        catch (IOException ioe){
            System.out.println(ioe);
 
        }
 
    }

}








// give command in terminal to get the output
// java BytesFromFileIo city.txt 