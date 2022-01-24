class A{
  int i;
}

class B extends A{
    int i=6;
    public B(){
        System.out.println("Value is "+super.i);
    }
}

public class OverridingDemo{
    public static void main(String[] args) {
       B obj = new B();
       
    }
}