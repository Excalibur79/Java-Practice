class Parent 
{
     int x=10;
     void print(){
         
     }
}
class Child extends Parent
{
     int x=20;
     void print(){
         System.out.println("ssss : "+x);
     }
}
class Test2
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		System.out.print(p.x+" ");
		Child c=new Child();
		System.out.print(c.x+" ");
		Parent p1=new Child();
		System.out.print(p1.x);
        p1.print();
	}
}