import java.util.Scanner;
class Main
{
  //int k=1;
  public static int power(int m, int n)
  {
    int k=1;
    while(n!=0)
    {
       k=k*m;
      n=n-1;
    }
    return k;
  }
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int j=power(a,b);
    System.out.println(j);
  }
}
    
    