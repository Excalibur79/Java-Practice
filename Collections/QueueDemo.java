import java.util.*;
public class QueueDemo {

    public static void main(String[] args) {
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        q.poll();
        System.out.println(q);

    }
}