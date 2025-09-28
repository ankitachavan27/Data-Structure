import java.util.Scanner;

public class thirdMax {
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
    public static void thirdMax(int arr[]){
        int FirstMax = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        if(arr[i]>FirstMax){
        thirdMax = SecondMax;
        SecondMax = FirstMax;
        FirstMax = arr[i];
        }
        else if(thirdMax<arr[i] && SecondMax>arr[i] ){ 
            thirdMax = arr[i];
        }
    } 
    System.out.println("the thirdmax is:" + thirdMax);
}
     public static void main(String[] args) {
        int[] arr = init();
        display(arr);
        thirdMax(arr);
        
       
       

        
    }
    
}
