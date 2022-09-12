public class Student implements DataCrud{

    private int id;
    private int rollno;
    private String name;
    private String course;
    private String phoneNumber;
    
    public void create(){
        System.out.print("Student was created.");
    }

    public void retrieve(int id){
        System.out.print("Student was retrieved.");
    }

    public void retrieveAll(){
        System.out.print("Student was retrieved.");
    }

    public void update(int id){
        System.out.print("Student was updated.");
    }

    public void delete(int id){
        System.out.print("Student was deleted.");
    }

    public Student(){
        id = 111;
        rollno = 1;
        name = "Gurjot Singh";
        course = "B.C.A.";
        phoneNumber = "9914450851";
    }

    public int getRollNo(){
        return this.rollno;
    }

    public String getName(){
        return this.name;
    }
    
    public String getCourse(){
        return this.course;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String toString(){
        return "Student: ---Student Id:- "+ this.id +"---Student Roll No:- "+ this.rollno + " ---Student Name:- "+this.name +" ---Student Course:- "+this.course +" ---Student Phone Number:- "+this.phonenumber;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setRollNo(int rollno){
        this.rollno = rollno;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public void setRollNo(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args){
       Student s1 = new Student();
       System.out.print(s1);
    }
}