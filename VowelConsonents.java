class VowelConsonents
{
   public static void main(String args[])
   {
    int Vcount=0,Ccount=0;
    String str="Engineering";
    String Vowels=" ";
    String Consonents=" ";
    char ch;
    str = str.toLowerCase();
    int n=str.length();
    for(int i=0;i<n;i++)
     {
      ch = str.charAt(i);
      if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
      {
       Vowels +=ch+" ";
      }
       else if(ch>='a'&&ch<='z')
      {
        Consonents +=ch+" ";
      }
    }
      System.out.println("Vowels:"+Vowels);
      System.out.println("Consonents:"+Consonents);
  }
}