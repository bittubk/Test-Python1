public class Person{

    private int id;
    private String name;
    private String phonenumber;

    public Person(){
        id=1;
        name="Gurjot Singh";
        phonenumber="9914450851";
    }

    public int getid(){
        return this.id;
    }

    public String getname(){
        return this.name;
    }

    public String getphonenumber(){
        return this.phonenumber;
    }

    public String toString(){
        return "Person: ---Person id:- "+ this.id + " ---Person Name:- "+ this.name + " ---Person Phone Number:- "+this.phonenumber;
    }

    public void setid(int id){
        this.id = id;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setphonenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }

    public static void main(String[]args){
        Person p1 = new Person();
        System.out.print(p1);
    }

}