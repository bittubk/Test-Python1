import java.util.Scanner;

class Input{

    public static Scanner scan = new Scanner (System.in);
    
    
    public static int getinteger(){
        return scan.nextInt();
    }

    public static long getlong(){
        return scan.nextLong();
    }

    public static short getshort(){
        return scan.nextShort();
    }

    public static byte getbyte(){
        return scan.nextByte();
    }


    public static float getfloat(){
        return scan.nextFloat();
    }

    public static double getdouble(){
        return scan.nextDouble();
    }

    public static boolean getboolean(){
        return scan.nextBoolean();
    }

    public static char getchar(){
        return scan.nextLine().charAt(0);
    }

    public static Student getstudent(){
        System.out.print("Student ID: ");
        int id = scan.nextInt();
        
    }


}