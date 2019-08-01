import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int d=n/2, de;
      for(int i=1;i<=d;i++)
      {
        de=n%i;
        if(de==0)
        {
          System.out.println(i);
        }
      }
      System.out.println(n);
	}
}