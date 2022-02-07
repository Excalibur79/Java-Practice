import java.util.*;
import static java.lang.Math.*;

class Job{
    int id,profit,deadline;
    Job(int id,int deadline,int profit){
        this.id=id;
        this.profit=profit;
        this.deadline=deadline;
    }
}

class Solution{
    int[] JobScheduling(Job arr[], int n){       
        int ans[] = new int[2];
        boolean slots[]=new boolean[n];
        Arrays.fill(slots,false);
        int totalProfit=0;
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        for(Job data:arr){
            for(int i=min(n-1,data.deadline-1);i>=0;i--){
                if(slots[i]==false){
                    slots[i]=true;
                    ans[0]++;
                    totalProfit+=data.profit;
                    break;
                }
            }
        }
        ans[1]=totalProfit;
        return ans;

    }
}


public class JobSequencingProblem {
    public static void main(String[] args) {
        Solution ob = new Solution();       
        Job job1 = new Job(1,4,20);
        Job job2 = new Job(2,1,10);
        Job job3 = new Job(3,1,40);
        Job job4 = new Job(4,1,30);
        Job arr[] = {job1,job2,job3,job4};
       int  ans[]=ob.JobScheduling(arr, arr.length);
       for(Job data:arr){
           System.out.println("Job id : "+data.id+" profit : "+data.profit+" deadline : "+data.deadline);
       }
      for(int data:ans)
       System.out.println(data+" ");
    }
}