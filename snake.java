import java.util.*;
class snake
{
    public static void main(String args[])
    {
        int dice[]={3,1,2,5,4,6};
        int r=0,s=0;
        Scanner sc=new Scanner (System.in);
        for(s=0;s<=100;s++)
        {
        System.out.println("Enter the position from 0 to 5");
        r=sc.nextInt();
        System.out.println("position value is "+dice[r]);
        s=s+dice[r];
        r=0;
        if(s%9==0 || s%7==0)
        s=s-5;
        if(s>100)
        break;
        System.out.println("The position where you lie"+s);
     }
    }
}
