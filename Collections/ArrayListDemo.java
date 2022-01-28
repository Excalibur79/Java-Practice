import java.util.ArrayList;
public class ArrayListDemo {

    public static void main(String[] args) {
    //     ArrayList<String> arr = new ArrayList<>();
    //     ArrayList<String> arr2 = new ArrayList<>();
    //     arr2.add("hhh");
    //     arr.add("Ankur");
    //     arr.add(1,"Dante");
    //     arr.addAll(arr2);
    //     arr.remove("Ankur");
    //   for(String data:arr)
    //     System.out.println(data);

    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(0);
    arr.remove(Integer.valueOf(1));
    // for(Integer data:arr)
    //     System.out.println(data);
    System.out.println(arr.get(0));
    }   
}