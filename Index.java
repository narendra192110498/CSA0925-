import java.util.*;
class Index 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string:");
String str = sc.nextLine();
System.out.println("Enter the character to find:");
char ch = sc.next().charAt(0);
int index = -1;
int n = str.length();
for (int i = 0; i < n; i++)
{
if (str.charAt(i) == ch) 
{
index = i;
break;
}
}
if (index != -1) 
{
System.out.println("The character '" + ch + "' found at index " + index);
} 
else 
{
System.out.println("The character '" + ch + "' is not found in the string.");
}
}
}