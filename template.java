class Pair{
    int first,second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}


public class template {

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
}