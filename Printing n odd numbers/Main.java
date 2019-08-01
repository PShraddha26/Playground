import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int q=0, c=0;
      for(int i=1;i<=20;i++)
      {
        q=i%2;
        if(q==1 && c<n)
        {
          System.out.println(i);
          c=c+1;
        }
        
      }
	     
	}
}