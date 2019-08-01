import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
          int n=s.nextInt();
      int l=n%10;
      int k=n/10;
      int su=k+l;
      System.out.println(su);
	}
}