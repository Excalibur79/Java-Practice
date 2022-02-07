package PackagePractice.Management;
import PackagePractice.Student.Student;
public class Management{
    public static void main(String[] args) {
        Student obj = new Student("Ankur",2000);
        obj.printDetails();
        // obj.year;       
    }
}
class X extends Student{
    boolean year;
    public X(){
        super("Dante",20);
    }
    public void fun(){
      
    }
}