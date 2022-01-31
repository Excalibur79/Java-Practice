import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,Integer> numbers = new HashMap<>();
        List<Integer> arr = new ArrayList<>(); //Program to find frequence of numbers in array
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(1);
       for(int number:arr){
           if(!numbers.containsKey(number))
                numbers.put(number,1);
            else{
                int val=numbers.get(number);
                numbers.put(number,val+1);
            }
       }
       System.out.println(numbers);
    }
}