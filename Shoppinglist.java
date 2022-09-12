import java.util.Vector;

public class Shoppinglist {
    
    public static void main(String[] args){
        Vector shoplist = new Vector(5);

        for(int i=0; i<shoplist.capacity(); i++){
            shoplist.addElement(args[i]);
        }

        for(int i=0; i<shoplist.size(); i++){
            System.out.println(shoplist.elementAt(i));
        }
    }
}