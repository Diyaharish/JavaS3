import java.util.*;
class transpose
{
    public static void main(String args [])
     {
         
         int i,j,r,c;
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter number of rows and columns ");
         r = obj.nextInt();
         c = obj.nextInt();
         int a[][] = new int[20][20];
         int b[][] = new int[20][20];
         
         System.out.println("Enter elements ");
         for(i=0;i<r;i++)
          for(j=0;j<c;j++)
          
          {
              a[i][j] = obj.nextInt();
          }
   
         System.out.println("Entered Matrix");
         for(i=0;i<r;i++)
          {
          System.out.print("\n");
          for(j=0;j<c;j++)
              System.out.print(a[i][j]+ "\t");
          }
         for(i=0;i<r;i++)
          for(j=0;j<c;j++)
          
          {
              b[j][i] = a[i][j];
          }

        System.out.println("\nTransposed Matrix");
        for(i=0;i<c;i++)
         { 
          System.out.print("\n");
          for(j=0;j<r;j++)
              System.out.print(b[i][j]+"\t");
         }
     }
    
}
