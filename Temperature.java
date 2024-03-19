import java.util.*;
class Temperature
{
public static void main(String arg[])
{
int c,f;
double x,y;
Scanner sc=new Scanner(System.in);
System.out.println("enter c value");
c=sc.nextInt();
System.out.println("enter f value");
f=sc.nextInt();
x=(c*9/5)+32;
y=(f-32)*5/9;
System.out.println(x);
System.out.println(y);
}
}