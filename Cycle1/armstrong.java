import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int n,n1,d,s=0;
    System.out.println("Enter a number");
    n=obj.nextInt();
    n1=n;
    while(n!=0)
    {
        d=n%10;
        s=(d*d*d)+s;
        n/=10;
    }
    if(n1==s)
    System.out.println(n1+" is an armstrong number");
    else 
    System.out.println(n1+" is not an armstrong number");

}
}
