import java.util.Scanner;

public class array2 {
    public static  Scanner sc = new Scanner(System.in);
    public static int[] init(){
       
        int size;
        System.out.println("enter the size of array");
        size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.println("enter the data");
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

     public static void displayEven(int[] arr) {
        System.out.println("Array Elements Are");
         
         for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
            System.out.print(arr[i] );
            }
           
            
        }
       
        System.out.println();
    }
    public static void displayOdd(int[] arr){
        System.out.println("Array Elements Are");

         for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
            System.out.print(arr[i] );
            }
           
            
        }
        
    System.out.println();
    }
     public static void main(String[] args) {
        
       
       int[] arr = init();
       displayEven(arr);
       display(arr);
       displayOdd(arr);
      
    }


    
}
