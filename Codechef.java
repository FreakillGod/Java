import java.util.Scanner;

class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
int t,n;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
while(t!=0)
{
   n=sc.nextInt();
   String s=new String();
   s=sc.next();
   char t1;
   char ch[]=s.toCharArray();
   if(n%2==0)
   {
       for(int i=0;i<n;i+=2)
       {
           t1=ch[i+1];
           ch[i+1]=ch[i];
           ch[i]=t1;
       }
   }
   else
   {
       for(int i=0;i<n-1;i+=2)
       {
           t1=ch[i+1];
           ch[i+1]=ch[i];
           ch[i]=t1;
           
       }
   }
    for(int i=0;i<n;i++)
    {
        if(ch[i]<=109)
            ch[i]=(char)(122-(ch[i]-97));
        else
            ch[i]=(char)(97+(122-ch[i]));
    }
    for(int i=0;i<n;i++)
    System.out.print(ch[i]);
    System.out.println("");
 t--;      
}
}
}

