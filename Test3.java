 class Plant{

    private String name;
    
    public Plant(String name){ this.name=name;}
    public Plant(){
        this("Fern");
    }
    public String getName(){return name;}
   
  
  }
  
  class Tree extends Plant{
  
    public void growFruit(){}
  
    public void dropLeaves(){}
  
  }


public class Test3 {
    public static void main(String[] args) {
     Plant obj = new Tree();
     System.out.println(obj.getName());
    }
    
}