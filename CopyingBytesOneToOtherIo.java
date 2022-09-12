import java.io.*;

public class CopyingBytesOneToOtherIo {
    public static void main(String [] args) {
        FileInputStream infile = null;
        FileOutputStream outfile = null;
        
        byte byteRead = 1;

        try{
            infile = new FileInputStream("input1.txt");
            outfile = new FileOutputStream("output1.txt");

            // do{
            //     byteRead = (byte) infile.read();
            //     outfile.write(byteRead);
            // }
            // while (byteRead != -1);

            while ((byteRead= (byte) infile.read()) != -1){
                // byteRead = (byte) infile.read();
                outfile.write(byteRead);
            }
           
        }

        catch (FileNotFoundException e){
            System.out.println("file not found");
        }

        catch (IOException e){
            System.out.println(e.getMessage());
        }

        finally{
            try{
                infile.close();
                outfile.close();
            }
            catch (IOException e){
            }
        }
    }
}