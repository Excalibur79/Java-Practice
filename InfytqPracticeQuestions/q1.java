package InfytqPracticeQuestions;
import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> sortedalpha = new ArrayList<>();
        ArrayList<Integer> sorteddigits = new ArrayList<>();
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c))
                sorteddigits.add(c-'0');            
            else
                sortedalpha.add(c);
        }
        
        int n = sortedalpha.size();
        int m = sorteddigits.size();
        if(n==s.length() || m==s.length()){
            System.out.println(-1);
            return;
        }
        Collections.sort(sortedalpha);
        Collections.sort(sorteddigits);
        int sortedAlphaSortDiff = Math.abs( s.indexOf(sortedalpha.get(0)) - s.indexOf(sortedalpha.get(n-1)) );
        int sortedDigitsDiff = Math.abs( s.indexOf(sorteddigits.get(0)+'0')  - s.indexOf(sorteddigits.get(m-1)+'0'));
        String outstr="";
        for(Character c:sortedalpha)
            outstr+=c;
        outstr+=sortedAlphaSortDiff+":";
        int sum=0;
        for(int data:sorteddigits)
            sum+=data;
        outstr+=sum;
        outstr+=sortedDigitsDiff;
        System.out.println(outstr);




    }

}