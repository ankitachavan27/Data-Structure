import java.util.Scanner;

public class even_odd_filter {
      public static  Scanner sc = new Scanner(System.in);
      public static int[] init(){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the data:");
            arr[i] = sc.nextInt();

        }
   return arr;
    }

     public static void display(int[] arr) {
        System.out.println("Array Elements Are");
         System.out.print("[");
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] );
            if(arr.length-1!=i)
             System.out.print(",");
            
        }
        System.out.print("]");
        System.out.println();
    }
    public static void filter_even_odd(int arr[],int start,int end){
        while(start<=end){
            if(arr[start]%2==0 & arr[end]%2!=0){
                start++;
                end--;
            }
            else if(arr[start]%2!=0 && arr[end]%2==0){
                int temp = arr[start];
                arr[start]= arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if(arr[start]%2==0 && arr[end]%2==0){
                start++;
            }
            else{
                end--;
            }
        }
    }
    public static void display_even_odd(int arr[],int start,int end){
        filter_even_odd(arr, start, end);
    }
     public static void main(String args[]){
        int[] arr = init();
       display(arr);
       display_even_odd(arr,0,arr.length-1);
       display(arr);
        
    }
    
}
