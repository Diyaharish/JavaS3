import java.util.*;
class program6
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 2 strings to be concatenated :");
        String st1 = obj.nextLine();
        String st2 = obj.nextLine();
        
        System.out.println("Enter 2 numbers to be concatenated :");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        
        Join obj1 = new Join();
        obj1.Concatenate(num1,num2);
        obj1.Concatenate(st1,st2);
    }
}

class Join
{
    void Concatenate(int a,int b)
       { 
          System.out.println("Concatenated numbers = " +a+b);
       }
    
    void Concatenate(String a,String b)  
       {
 System.out.print("Concatenated strings = "+a+b);
       }
}
