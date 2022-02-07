class A{
    public void show(){
        System.out.println("In A show");
    }
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("I am best");
            }
            public void walk(){
                System.out.println("I am walking!");
            }
        };
        obj.show();
      
    }
    
} 