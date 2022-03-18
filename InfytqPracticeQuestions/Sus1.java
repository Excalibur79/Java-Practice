package InfytqPracticeQuestions;
import java.util.*;



public class Sus1 {

    public static boolean isNumeric(String s){     
       for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
           if(!Character.isDigit(c)){
                return false;
           }
       }
       return true;
    }

    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static String reverse(String s){
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        return ans;
    }
    

    public static int numberOfFactors(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s+=' ';      
        ArrayList<String> nums = new ArrayList<>();
        int i=0,j=1;
        while(j<s.length()){
            char c = s.charAt(j);
            if(c==' '){               
                if(isNumeric(s.substring(i,j))){
                    nums.add(s.substring(i, j));
                }               
                i=j+1;
            }
            j++;
        }
     
        if(nums.size()==0)
            System.out.println(-1);
        else{
            int sum=0;
            for(String data:nums){
                int lastDigit = data.charAt(data.length()-1) - '0';
                sum+=lastDigit;
            }
            if(isPrime(sum)){
                System.out.println(sum);
            }
            else if(isPrime(Integer.parseInt(reverse(Integer.toString(sum))))){
                System.out.println(Integer.parseInt(reverse(Integer.toString(sum))));
            }
            else{
                System.out.println(numberOfFactors(Integer.parseInt(reverse(Integer.toString(sum)))));
            }
        }
        
    }
}   