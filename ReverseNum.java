import java.util.*;
class ReverseNum
{
public static void main(String[] args)
{
int rev=0,n,rem;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
while(n!=0)
{
rem=n%10;
rev=rem+rev*10;
n=n/10;
}
System.out.println("reverse number:"+rev);
}
}