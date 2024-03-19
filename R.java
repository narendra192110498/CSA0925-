import java.util.*;
class R
{
public static void main(String[] args)
{
int rev=0,n,rem;
n=1243;
while(n!=0)
{
rem=n%10;
rev=rem+rev*10;
n=n/10;
}
System.out.println("reverse number:"+rev);
}
}