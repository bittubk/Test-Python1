import java.io.*;

public class CopyFiles {

    static String fileName = "input2.txt";
    static String fileName2 = "output2.txt";

    public static void main(String[] args) {
        copyFile(fileName, fileName2);
    }

    static void copyFile(String sourceFile, String destinationFile) {
        int byteRead;

        // Create a file stream
        FileInputStream infile = null;
        FileOutputStream outfile = null;

        try {
            infile = new FileInputStream(sourceFile);
            outfile = new FileOutputStream(destinationFile);
            while ((byteRead = infile.read()) != -1)
                outfile.write(byteRead);
            System.out.println(sourceFile + " file was copied to " + destinationFile);
        } catch (IOException ex) {
            System.out.println(ex);
            ex.printStackTrace();
        } finally {
            try {
                infile.close();
                outfile.close();
            } catch (Exception ex) {
            }
        }
    }

}