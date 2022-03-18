import java.util.*;
public class q111 {

    static int it=0;
 public static int b(int array[],int low,int high,int k){
     it++;
     if(low<=high){
         int mid= (low+high)/2;
         if(array[mid]==k)
            return mid;
        if(array[mid]<array[mid])
            return b(array,mid+1,high,k);
        return b(array,low,mid-1,k);
     }
     return -1;
 }
        public static void main(String[] args) {
            int arr[]={20,35,50,55,75,82,85,90};
            System.out.println(b(arr,0,7,85));
            System.out.println(it);
    }       
    
}