
class Calc{
    static int x;
    static{
       

        x=6;
        System.out.println(x);
    }
    static{
        x=5;
        System.out.println(x);
    }
    
}

public class ObjectDemo {

    public static void main(String[] args) {
    //    int test;
    //     Calc obj=new Calc();
        // obj.x=5;
        // System.out.println(obj.x);
        // System.err.println(Calc.x);
        Calc obj1 = new Calc();
        Calc obj2 = new Calc();
        // obj1.x=6;
        // System.out.println(obj1.x);
        // System.out.println(obj2.x);
    }
}