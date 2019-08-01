import java.util.Scanner;
class Main{
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=sc.nextInt();
      }
      int value=sc.nextInt();
      subset(arr_size, arr, value);
    }
  public static void subset(int arr_size, int arr[], int value)
  {
    for(int i=0;i<=(arr_size-1);i++)
    {
      for(int j=i+1;j<=(arr_size-1);j++)
      {
        int sum=arr[i]+arr[j];
        
        if(sum==value)
        {
        System.out.println(arr[i]+", "+arr[j]);
        }
      }
  }
}
}