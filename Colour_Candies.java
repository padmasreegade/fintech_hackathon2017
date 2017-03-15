import java.util.Scanner;
class Color_Candies
{
public static void main (String[] args) 
	{  
        int j; 
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        for(j=0;j<n;j++)
       {     
        int i,count_a,count_b;
        String str=s.next();
        int len=str.length();
         count_a=0;
         count_b=0;    
        for(i=0;i<len;i++)
        {
            if(str.charAt(i)=='a')
                count_a++;
            if(str.charAt(i)=='b')
                count_b++;
        }
        if((count_a+count_b)==len)
           {
             if(count_a<count_b)
              System.out.println(count_a);
             else
              System.out.println(count_b);   
        }
        else
            System.out.println("Enter another string contaning a's and b's only");
       }
    }
}