import java.util.*;
class Marks
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int m1,m2,m3,m4;
System.out.println("enter the marks in python");
m1=sc.nextInt();
System.out.println("enter the marks in  c++");
m2=sc.nextInt();
System.out.println("enter the marks in java");
m3=sc.nextInt();
System.out.println("enter the marks in c");
m4=sc.nextInt();
int total=(m1+m2+m3+m4);
float ag=(total)/4;
System.out.println("total "+total);
System.out.println("the average is"+ag);
if(ag>75)
{
System.out.println("distinction");
}
else if(ag>=60 &&ag<75)
{
System.out.println("first distinction");
}
else if(ag>=50 &&ag<60)
{
System.out.println("second distinction");
}
else if(ag>=40 &&ag<50)
{
System.out.println("fail");
}
}
}