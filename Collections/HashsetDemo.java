import java.util.HashSet;
import java.util.Set;


public class HashsetDemo {
 
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(7);
        set.remove(7);
        System.out.println(set);
    }
    
}