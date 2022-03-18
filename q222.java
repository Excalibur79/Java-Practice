import java.util.*;
public class q222 {

    public static int highestOccuringChar(String s){
        int maxCount=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int count=1;
            for(int j=i+1;j<s.length();j++){
                char c2=s.charAt(j);
                if(c==c2){
                    count++;
                }
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }

    public static HashSet<String> generateAllSubStrings(String s,int l,int h){
        HashSet<String> ans = new HashSet<>();       
        for(int k=l;k<=h;k++){
            for(int i=0;i<=s.length()-k;i++){
                ans.add(s.substring(i, i+k));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inarr[] = sc.nextLine().split(",");
        int num1 =sc.nextInt();
        int num2 = sc.nextInt();
        ArrayList<Integer> eleMaxCounts=new ArrayList<>();
        for(String data:inarr){
            int res = highestOccuringChar(data);
            eleMaxCounts.add(res);
        }
        int i=0;
        String xx="";       
        for(int j=1;j<inarr.length;j++){
            int idx = eleMaxCounts.get(i)%inarr[j].length();
            char c = inarr[j].charAt(idx);
            xx+=c;
        }
        System.out.println(generateAllSubStrings(xx,num1,num2).size());

        
    }
    
} 