import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int flag=-1;
      int arr[]=new int[5];
     
      for(int i=0;i<5;i++)
      {
        arr[i]=sc.nextInt();
      }
       int search_elem_1=sc.nextInt();
      int search_elem_2=sc.nextInt();
      for(int i=0;i<5;i++)
      {
        if(search_elem_1==arr[i])
        {
         
          System.out.println(i);
        }
      }
      for(int i=0;i<5;i++)
      {
        if(search_elem_2==arr[i])
        {
          flag=0;
          System.out.println(i);
        }
       
      }
   
        
          if(flag==-1)
          System.out.println(flag);
        
    }
}