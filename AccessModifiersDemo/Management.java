package AccessModifiersDemo;
import AccessModifiersDemo.Student.*;

 class X{
    private int x,y;
    // X(){
    //     System.out.println("X obj created!");
    // }
    X(){
        System.out.println("INirializing :");
        this.x=6;
    }
    X(int x){
        this.x=x;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}

class BadStudent extends X{
    // BadStudent(){
    //     super("a",1);
    // }
}

public class Management{
    public static void main(String[] args) {
        // Student std = new Student();
        // int marks = std.marks;
        Teacher teacher = new Teacher("Elliot");
        X obj = new X();
        System.out.println("hola ss "+obj.getX()+" y is"+obj.getY());
        // int yy;
        // System.out.println("yy is:"+yy);

    }
}