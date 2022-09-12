import firstPackage.FirstClass;
import secondPackage.SecondClass;
import firstPackage.subPackage.ThirdClass;

public class TestPackage {

    public static void main(String [] args){
        FirstClass ob = new FirstClass();
        ob.display();

        SecondClass ob1 = new SecondClass();
        ob1.display();

        ThirdClass ob2 = new ThirdClass();
        ThirdClass ob3 = new ThirdClass();
        ob2.display();
        ob3.display1();

    }
}