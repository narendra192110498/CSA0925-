class CountVowel
{
   public static void main(String args[])
   {
    int Vcount=0;
    String str="Engineering";
    String Vowels=" ";
    char ch;
    str = str.toLowerCase();
    int n=str.length();
    for(int i=0;i<n;i++)
     {
      ch = str.charAt(i);
      if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
      {
       Vowels +=ch+" ";
       Vcount++;
      }
     }
      System.out.println("length is:"+n);
      System.out.println("number of Vowels:"+Vcount);
      System.out.println("Vowels:"+Vowels);
  }
}