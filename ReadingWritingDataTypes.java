import java.io.*;

public class ReadingWritingDataTypes {
    public static void main(String [] args) throws Exception{
        File primitive = new File ("datatypes.dat");
        FileOutputStream fos = new FileOutputStream (primitive);
        DataOutputStream dos = new DataOutputStream (fos);
        
        dos.writeInt (2000);
        dos.writeDouble (25.25);
        dos.writeBoolean (true);
        dos.writeChar ('G');
        dos.close();
        fos.close();

        System.out.println("Printing Primitive Data Types:- ");
        FileInputStream fis = new FileInputStream (primitive);
        DataInputStream dis = new DataInputStream (fis);
        System.out.println (dis.readInt());
        System.out.println (dis.readDouble());
        System.out.println (dis.readBoolean());
        System.out.println (dis.readChar());
        dis.close();
        fos.close();
    }
}