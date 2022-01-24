class Outer{
    static int x;
    static{
        x=5;
    }
   static class Inner{
        public void show(){
            System.out.println("Inside Inner!"+x);
        }
    }
}

public class InnerDemo {
    public static void main(String args[]){
        Outer obj = new Outer();
        Outer.Inner obj1= new Outer.Inner();
        obj1.show();
    }
}