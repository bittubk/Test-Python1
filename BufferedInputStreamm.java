import java.io.*;

public class BufferedInputStreamm {
    public static void main(String args[]) {
        testOutput();
        testInput();
    }

    private static void testOutput() {
        try {
            FileOutputStream fout = new FileOutputStream("testout.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);

            String s = "Welcome to javaTpoint.";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();

            bout.close();
            fout.close();
            System.out.println("Written to file with success.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void testInput() {
        try {
            FileInputStream fout = new FileInputStream("testout.txt");
            BufferedInputStream bout = new BufferedInputStream(fout);

            System.out.print("File Contents are : ");
            int i;
            while ((i = bout.read()) != -1) {
                System.out.print((char) i);
            }

            bout.close();
            fout.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}