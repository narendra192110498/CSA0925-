class CharacterFinder 
{
public static void main(String[] args) 
{
String str = Iamaprogrammer;
char ch = 'p';
int index = findCharacterIndex(str, ch);
if (index != -1) 
{
System.out.println("Character '" + ch + "' found at index: " + index);
} 
else 
{
System.out.println("Character '" + ch + "' not found in the string.");
}
}
int findCharacterIndex(String str, char ch) 
{
for (int i = 0; i < str.length(); i++) 
{
if (str.charAt(i) == ch) 
{
return i;
}
}
}
}
