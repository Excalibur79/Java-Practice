import java.util.ArrayList;
import java.util.Collections;

class Pair{
    int first,second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}

public class Test4 {

    public static void main(String[] args) {
        ArrayList<Pair> arr = new ArrayList<>();
        arr.add(new Pair(1,2));
        arr.add(new Pair(-5,6));
        Collections.sort(arr,(a,b)->a.first-a.second);
        for(Pair data:arr){
            System.out.println(data.first+" "+data.second);
        }
    }   
}