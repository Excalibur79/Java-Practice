import java.util.*;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
public class PriorityQueueDemo {

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(5);
        pq.offer(4);
        pq.offer(9);
        System.out.println(pq);
    }
}