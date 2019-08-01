import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[5];
      int max=1;
      for(int i=0;i<5;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<5;i++)
      {
        if(arr[i]>max)
        {
          max=arr[i];
        }
      }
      System.out.println(max);
    }
}