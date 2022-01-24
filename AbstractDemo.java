abstract class Human{
    abstract public void walk();
    public void talk(){
        System.out.println("i am speaking!");
    }
    // public void demoFun(){
    //     System.out.println("This is a Human FUnction");
    // }
}

class Man extends Human{
    public void walk(){
        System.out.println("Man is walking!");
    }
    public void demoFun(){
        System.out.println("This is a Man FUnction");
    }
    
}


public class AbstractDemo {
    public static void main(String[] args) {
        Human obj = new Man();
       
    }
    
}