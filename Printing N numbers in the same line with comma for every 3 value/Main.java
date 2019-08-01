import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int i, c=0;
    for(i=1;i<=n;i++)
    {
      
      System.out.print(i);
      c=c+1;
      if(c==3)
      {
        System.out.print(",");
        c=0;
      }
    }
    
  }
}