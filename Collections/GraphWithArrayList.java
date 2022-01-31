import java.util.List;
import java.util.Collections;


import java.util.ArrayList;
public class GraphWithArrayList {

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<3;i++){
            List<Integer> p = new ArrayList<>();
            for(int j=4;j>=0;j--){
                p.add(j);
            }
            graph.add(p);
        }
        Collections.sort(graph.get(0));
        System.out.println(graph);
    }

}