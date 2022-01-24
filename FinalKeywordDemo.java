class A{
    final  int data;
    public A(){
        data=2;
        System.out.println("Inside A"+data);
    } 
    // public A(int data){
    //     this.data=data;
    // }
   
}

class B extends A{
   public B(){
    //   super(5);
   }
}


public class FinalKeywordDemo {

    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.data);
    }
}