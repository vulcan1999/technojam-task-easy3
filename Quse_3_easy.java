import java.util.*;
import java.io.*;
class Quse_3_easy
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        long n,c;
        int k;
        System.out.println("Enter a nummber");
        n=sc.nextLong();
        System.out.println("Enter a number of times you want to subtract 1 from last digit of number");
        k=sc.nextInt();
        if(n>9)
        {
            for(int i=1;i<=k;i++)
            {
            c=n%10;
            if(c!=0)
            n=n-1;
            else
            n=n/10;
        }
         System.out.println(n);       
    }
    else
    System.out.println("Invalid input");
}
}