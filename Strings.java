public class Strings {

    public static void main(String [] args){

        String s1 = "      Gurjot       ";
        String s2 = "Singh ";

        String s3 = s1+s2;

        System.out.print("Printing String: ");
        System.out.println(s3);

        System.out.print("Concatenating: ");
        System.out.println(s1.concat(s2));

        System.out.print("Equals: ");
        System.out.println(s1.equals(s2));

        System.out.print("Compare To: ");
        System.out.println(s1.compareTo(s2));

        System.out.print("Equals Ignoring Case: ");
        System.out.println(s1.equalsIgnoreCase(s2));  

        System.out.print("Sub-String: ");
        System.out.println(s1.substring(3));

        System.out.print("Sub-String with values: ");
        System.out.println(s1.substring(3, 6));

        System.out.print("Char At: ");
        System.out.println(s1.charAt(5));

        System.out.print("Index Of: ");
        System.out.println(s1.indexOf(2, 6));

        System.out.print("Length: ");
        System.out.println(s1.length());

        System.out.print("Trim (Removing white spaces): ");
        s2 = s1.trim();
        System.out.println(s2);

        System.out.print("To Uppercase: ");
        s2 = s1.toUpperCase();
        System.out.println(s2);

        System.out.print("To Lowercase: ");
        s2 = s1.toLowerCase();
        System.out.println(s2);
    }
    
}
