interface Human{
    public abstract void talk();
}

class Man implements Human{
    public void talk(){
        System.out.println("Man Talks!");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
            Human obj = new Man();
            obj.talk();
    }   
    
}