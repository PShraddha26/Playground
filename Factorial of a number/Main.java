import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i=1,f=1;
      while(i<=n)
      {
        
        f=f*i;
        i=i+1;
      }
      System.out.println(f);
	}
}