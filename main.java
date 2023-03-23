//take a 8 digit number find factorial of digits in even positions and cube root of digits in odd positions.
import java.util.Scanner;
import java.math.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int flag=0,cnt=0;
        long temp=0;
        while(cnt!=8)
        {
        cnt=0;
        long num=sc.nextLong();
        temp=num;
        while(num>0)
        {
            num/=10;
            cnt++;
        }
        }
        int pos=8;
        long t=temp;
        while(t>0)
        {
            long re=t%10;
            if(pos%2==0)
            {
                long fact=1;
                for(long itr=1;itr<=re;itr++)
                {
                    fact=fact*itr;
                }
                System.out.println(fact);
            }
            else{
                System.out.println(Math.cbrt(re));
            }
            pos--;
            t/=10;
        }
        
        
    }
}

