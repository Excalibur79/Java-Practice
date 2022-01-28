package PackagePractice.Student;
public class Student{
    private String name;
    int year;
    public Student(String name,int year){
        this.name=name;
        this.year=year;
    }
    public void printDetails(){
        System.out.println("name is: "+name+" year is"+year);
    }
}


