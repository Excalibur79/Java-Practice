import java.io.*;
import java.util.*;
public class infytQ_Q5 {
   public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
int num=sc.nextInt();  
String outstr="";
if(num>=s1.length()||num>=s2.length())
{
   outstr=s1+s2;
}
else
{
    for(int i=0;i<Math.max(s1.length(),s2.length());i+=num)
    {
       if(s1.length()>=num)
       {
              outstr=outstr+s1.substring(0,num)+"";
              s1=s1.substring(num);
         }
         if(s2.length()>=num)
         {
              outstr=outstr+s2.substring(0,num)+" ";
              s2=s2.substring(num);
         }
    }
    while(s1.length()>=num)
    {
        outstr=outstr+s1.substring(0,num)+" ";
        s1=s1.substring(num);
    }
    while(s2.length()>=num)
    {
        outstr=outstr+s2.substring(0,num)+" ";
        s2=s2.substring(num);
    }
    outstr=s1+s2;
}
System.out.println(outstr);
}

}