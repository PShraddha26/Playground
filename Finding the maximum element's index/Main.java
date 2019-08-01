import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int list[]=new int[n];
    int max=1,in=0;
    for(int i=0;i<n;i++)
    {
      list[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      if(list[i]>max)
      {
        max=list[i];
        in=i;
      }
    }
    System.out.println(in);
  }
}