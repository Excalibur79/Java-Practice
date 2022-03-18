import java.util.*;
public class Test5 {

    public static void main(String[] args) {
        int m=2,n=3;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<m;i++){
            String[] a = sc.nextLine().split(","); 
            ArrayList<Integer> row =new ArrayList<>();
            for(String data:a){
                row.add(Integer.parseInt(data));
            }
            arr.add(row);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr.get(i).get(j));
            }
            System.out.println();
        }
    }
}