import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int q=0;
      for(int i=1;i<=n;i++)
      {
        q=i%2;
        if(q==1)
        {
          System.out.println(i);
        }
      
      }
	}
}