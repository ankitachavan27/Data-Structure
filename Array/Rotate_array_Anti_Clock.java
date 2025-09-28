import java.util.Scanner;

public class Rotate_array_Anti_Clock {
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
     public static void Reverse(int[] arr,int start , int end){
       
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
      
     
      
     }

     public static void clockWise(int[] arr,int position) {
        Reverse(arr, 0, arr.length-1);
        Reverse(arr, 0, position-1);//clockwise
        Reverse(arr, position, arr.length-1);
     }

      public static void AnticlickWise(int[] arr,int position) {

        Reverse(arr, 0, position-1);
        Reverse(arr, position, arr.length-1);
        Reverse(arr, 0, arr.length-1);
        
     }

     
    public static void main(String[] args) {
        int[] arr = init();
        System.out.println("enter the position:");
        int position = sc.nextInt();
        if(position>arr.length){
            position=position%arr.length;
        }
       clockWise(arr, position);

       display(arr);
        AnticlickWise(arr, position);
       display(arr);

       
        
    }
    
}
