import java.util.Scanner;

public class sorting {


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
   public static void bubble_sort(int[] arr){
    
    for(int i=0;i<arr.length;i++){
        int swap =0;
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap =1;

        }
      }
        if(swap==0){
            break;
        }
     
        System.out.println("passses" + (i+1));
        display(arr);
    }
   }
    public static void main(String[] args) {
          int[] arr = init();
          display(arr);
          bubble_sort(arr);
          display(arr);
        
    }
    
}
