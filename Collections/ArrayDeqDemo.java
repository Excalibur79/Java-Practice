import java.util.ArrayDeque;
import java.util.Queue;
public class ArrayDeqDemo {

    public static void main(String[] args) {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.offerFirst(1);
        list.offerLast(5);
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list);
    }
}