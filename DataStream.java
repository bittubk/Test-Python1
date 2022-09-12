import java.io.*;

public class DataStream {
    public static void main(String[] args) throws IOException {
        testOutput();
        testInput();
    }

    private static void testOutput() throws FileNotFoundException, IOException {
        FileOutputStream file = new FileOutputStream("testout.dat");
        DataOutputStream data = new DataOutputStream(file);

        int i = 65;
        data.writeInt(i);
        System.out.println("Written value : " + i);

        double f = 65.232;
        data.writeDouble(f);
        System.out.println("Second Written value : " + f);

        data.flush();
        data.close();
        System.out.println("Data written with Succcess...");
    }

    
    private static void testInput() throws FileNotFoundException, IOException {
        FileInputStream file = new FileInputStream("testout.dat");
        DataInputStream data = new DataInputStream(file);

        int i = data.readInt();
        System.out.println("Read value : " + i);

        double f = data.readDouble();
        System.out.println("Second Read value : " + f);

        data.close();
        System.out.println("Data read with succcess...");
    }
}