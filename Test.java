public class Test {

    public static void main(String[] args) {
        // int a=(int)5.5;//typecasting explicit type conversion
        // byte b=0;
        // long  l=11l;
        // float f=5f;
        // double d=5;//implicit type conversion
        // char c='A';
        // c++;
        // System.out.println(l);
        try{
            int x = 10/0;
        System.out.println(x);
    }
    catch(ArithmeticException | ArrayIndexOutOfBoundsException err){
        System.err.println("Error");
    }
    }
    
}

