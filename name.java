import java.util.*;
class name
{
    public static void main(String args[])
    {
        String name[]= {"Dwarkadhish" , "Kanha" , "Gopal" , "Mohan" , "Govinda" , "Murlidhar" , "Madhav" ,
                        "Keshav" , "Hari" , "Vasudeva"};
        String str;
        int x=0;
        Scanner sc=new Scanner(System.in);
            for(int k=0;k<4;k++)
            {   System.out.println("Enter the Synonyms of God Krishna name");
                str=sc.nextLine();
                for (int i=0;i<10;i++)
                {
                    if(str.equalsIgnoreCase(name[i].trim()))
                    {
                      System.out.println("woh|user answer is true");
                      x=1;
                    }
                }
                if(x==1)
                break;
           }
}
}

