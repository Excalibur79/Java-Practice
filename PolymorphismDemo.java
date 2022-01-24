class A{
    public void Print(){
        System.out.println("in A");
    }
}

class B extends A{
    public void Print(){        
        System.out.println("in B");
    }
    public void config(){
        System.out.println("In config");
    }
}


class C extends A{
    public void Print(){
        System.out.println("in C");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        A obj=new B();
        obj.Print();
        obj=new C();
        obj.Print();
    }
    
}