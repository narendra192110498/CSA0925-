import java.util.*;
class F1
{
public static void main(String[] args)
{
int n1=0,n2=1,n3,num,i;
num=5;
for(i=2;i<=num;i++)
{
n3=n1+n2;
System.out.println(n3);
n1=n2;
n2=n3;
}
}
}