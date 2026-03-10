import java.util.*;
class wel
{
    public static void main(String args[])
    {
        String str="";
        int v=0,t=0,c=0,k=0,l=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        str=sc.nextLine().trim();
        l=str.length();
        if(l%2==0)
        {
           for(v=0;v<str.length()-1;v+=2)
           {
               for(t=0;t<=v;t++)
                System.out.print(str.charAt(t));
                  if(v==str.length()-1)
                  {
                    System.out.print(str.charAt(v-1));
                    break;
                  }
             System.out.println();
           }
           for(t=0;t<v;t++)
             System.out.print(str.charAt(t));
        }
        else
        {
          for(v=0;v<str.length();v+=2)
           {
               for(t=0;t<=v;t++)
                System.out.print(str.charAt(t));
             System.out.println();
           }  
        }
    }   
}
