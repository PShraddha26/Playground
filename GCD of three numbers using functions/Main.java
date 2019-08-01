import java.util.Scanner;
public class Main{
   public static int gcd(int m, int n)
  {
    int min,gcd=0;
    if(m>n)
    {
      min=n;
    }
    else
    {
      min=m;
    }
    while(min!=0)
    {
      if(m%min==0 && n%min==0)
      {
        gcd=min;
        break;
      }
      min=min-1;
    }
    return gcd;
  }
	public static void main (String[] args){
	    Scanner sc=new Scanner (System.in);
      int q=sc.nextInt();
      int s=sc.nextInt();
      int t=sc.nextInt();
      int r1=gcd(q,s);
      int r2=gcd(r1,t);
      System.out.println(r2);
    }
}