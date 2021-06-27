
//package
import java.util.Scanner;
public class edukoders {
    public static void main(String[] args) 
    {
        //data-types
        String name= "edukoders";
        char c='F';
        boolean bool= true;
        int a= 15;
        int b=20;
        
        //taking user input
        Scanner sc =new Scanner(System.in);
        int age= sc.nextInt();
        
       //logical operators | relational operators
        System.out.println(a<b || a==b);
        
        
        //control structures
        if(age>=18 && age<=60)
        {
          System.out.println("adult");  
        }
        else if(age>60)
        {
            System.out.println("old aged");
        }
        else
        {
            System.out.println("kid");
        }
        
        //loops
          for(int i=1; i<100; i++)
        {
            if(i%2!=0)
            {
            System.out.println(i);
            }
            
        }
        
       
        int i=1;
        while(i<10)
        {
            System.out.println(i);
            i++;
        }
        
        
        do
        {
            System.out.println(i);
            i++;
        }
        while(i>10);
              
        
        
    }
}
