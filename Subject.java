public class Subject {

    private int id;
    private String name;

    public Subject(){
        id = 1;
        name = "JAVA";
    }

    public int getid(){
        return this.id;
    }

    public String getname(){
        return this.name;
    }

    public String toString(){
        return "Subject: ---Subject id:- "+ this.id + " ---Subject Name:- "+this.name;
    }

    public void setid(int id){
        this.id = id;
    }

    public void setname(String name){
        this.name = name;
    }

    public static void main(String[] args){
        Subject s1 = new Subject();
        System.out.print(s1);
    }
    
}