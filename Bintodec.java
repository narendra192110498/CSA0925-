import java.util.*;
class Bintodec
{
public static void main(String arg[])
{
int i=1,dec=0,rem,rem1,n,oct=0,j=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter num:");
n=sc.nextInt();
while(n!=0)
{
rem=n%10;
dec=dec+i*rem;
n=n/10;
i=i*2;
}
System.out.println("binary to decimal num is:"+dec);
while(dec!=0)
{
rem1=dec%8;
oct=oct+j*rem1;
dec=dec/8;
j=j*10;
}
System.out.println("binary to octal num is:"+oct);
}
}