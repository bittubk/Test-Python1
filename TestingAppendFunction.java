import java.io.*;

public class TestingAppendFunction {
    public static void main(String[] args) throws IOException {
        File file1 = new File("appendTesting.txt");
        append(file1, "\nGurjot Singh");
        append(file1, "\nMd. Raja");
        append(file1, "\nGurpinder Singh");

        display(file1);
    }

    public static void append(File file1, String str) throws IOException {
        FileOutputStream ins = null;
        try {
            ins = new FileOutputStream(file1, true);
            for (byte b : str.getBytes()) {
                ins.write(b);
            }
        } catch (IOException exception) {
            System.out.println(exception);
            exception.printStackTrace();
        } finally {
            try {
                ins.close();
            } catch (IOException e) {
            }
        }
    }

    public static void display(File file1) {
        FileInputStream ins = null;
        try {
            ins = new FileInputStream(file1);

            int ch;
            System.out.println();

            while ((ch = ins.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
            System.out.println();

        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                ins.close();
            } catch (IOException e) {
            }
        }
    }
}