import java.util.*;
class S1
{
   public static void main(String args[])
   {
    String str="Lekhya";
String rev="";
char ch;
int n=str.length();
for(int i=n-1;i>=0;i--)
{
ch=str.charAt(i);
rev=rev+ch;
}
System.out.println(rev+"");
}
}