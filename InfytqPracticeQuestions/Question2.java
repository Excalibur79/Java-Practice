package InfytqPracticeQuestions;
import java.util.*;

import javax.swing.text.AbstractDocument.Content;

public class Question2 {

    public static int countDigits(int number){
        int count=0;
        while(number!=0){
            number/=10;
            count++;
        }
        return count;
    }

    public static int digitSum(int number){
        int sum=0;
        while(number!=0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inarr1 = new ArrayList<>();
        ArrayList<Integer> inarr2 = new ArrayList<>();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        String arr1[] = s1.split(",");
        String arr2[] = s2.split(",");
        for(String data:arr1){
            inarr1.add(Integer.parseInt(data));
        }
        for(String data:arr2){
            inarr2.add(Integer.parseInt(data));
        }
        TreeSet<Integer> common = new TreeSet<>();
        for(int i=0;i<inarr1.size();i++){
            int val1 = inarr1.get(i);
            for(int j=0;j<inarr2.size();j++){
                int val2 = inarr2.get(j);
                if(val2==val1){
                   common.add(val1);
                   break;
                }
            }
        }
        if(common.isEmpty() ){
            System.out.println(-1);
        }
        else if(common.first()==0 || common.first()>inarr1.size() || common.first()>inarr2.size()){
            System.out.println(-1);
        }   
        else{
            int number = common.first();
            while(countDigits(number)!=1){
                number = digitSum(number);
            }
            Collections.sort(inarr1,Comparator.reverseOrder());
            Collections.sort(inarr2,Comparator.reverseOrder());
            for(int i)


        }
        
    }
    
}