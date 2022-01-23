import java.util.*;
class Natural
{
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int n,i,s=0;
    System.out.println("Enter an integer");
    n=obj.nextInt();
    for(i=1;i<=n;i++)
    {
        s+=i;
    }
    System.out.println("Sum = "+s);
   }
}
