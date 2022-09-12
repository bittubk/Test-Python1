import java.io.*;

public class FileInputStreamm {
    public static void main(String[] args) {
        try {
            demo1();
            demo2();
            demo3();
            demo4();
        } catch (Exception ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }

    }

    static void demo1() throws FileNotFoundException, IOException {
        int b;

        FileInputStream fis = new FileInputStream("city1.txt");

        while ((b = fis.read()) != -1)
            System.out.print((char) b);

        fis.close();

    }

    static void demo2() throws FileNotFoundException, IOException {

        byte b[] = new byte[50];

        FileInputStream fis = new FileInputStream("city1.txt");

        while (fis.read(b) >= 0)
            System.out.println("'" + new String(b) + "\'");

        fis.close();

    }

    static void demo3() throws FileNotFoundException, IOException {

        byte b[] = "--------------------".getBytes();

        FileInputStream fis = new FileInputStream("city1.txt");

        System.out.print("Available Bytes : " + fis.available());

        int i = fis.read(b, 5, 3);
        System.out.println(i + " " + "'" + new String(b) + "\'");

        fis.close();

    }

    static void demo4() throws FileNotFoundException, IOException {
        int b;

        byte[] buf = "Java Input Output Stream".getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(buf);

        boolean multi = bais.markSupported();

        if (multi)
            bais.mark(2);

        while ((b = bais.read()) != -1)
            System.out.print((char) b);
        System.out.println("");

        if (multi) {

            bais.reset();

            while ((b = bais.read()) != -1)
                System.out.print((char) b);
            System.out.println("");

            bais.reset();

            while ((b = bais.read()) != -1)
                System.out.print((char) b);
            System.out.println("");

        }

        bais.close();

    }
}