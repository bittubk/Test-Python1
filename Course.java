public class Course {

    private int id;
    private String name;

    public Course(){
        id = 1;
        name = "B.C.A.";
    }

    public int getid(){
        return this.id;
    }

    public String getname(){
        return this.name;
    }

    public String toString(){
        return "Course: ---Course id:- "+ this.id + " ---Course Name:- "+this.name;
    }

    public void setid(int id){
        this.id = id;
    }

    public void setname(String name){
        this.name = name;
    }

    public static void main(String[] args){
        Course c1 = new Course();
        System.out.print(c1);
    }
    
}