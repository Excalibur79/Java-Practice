package InfytqPracticeQuestions;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.lang.*;
import java.util.Collections;

class Pair{
    int first,second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}

public class BiggestMeatBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();      
        ArrayDeque<Pair> arrdeq = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            Pair pair = new Pair(sc.nextInt(),i);
            arrdeq.offerLast(pair);
        }
        while(arrdeq.size()>1){
           Pair firstPair = arrdeq.peekFirst();
           int remaining = firstPair.first-d;
           if(remaining>0)
            arrdeq.offerLast(new Pair(remaining,firstPair.second));
            arrdeq.pollFirst();
        }
        System.out.println(arrdeq.peekFirst().second+1);
    }
}
