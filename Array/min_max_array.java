import java.util.Scanner;

public class min_max_array {
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
    
    public static void MIN(int arr[]){
        int Min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
        if(arr[i]<Min){
            Min = arr[i];
        }
       
    }
     System.out.println("the minimum element is" +" "+ Min);
    }

    public static void MAX(int arr[]){
       int Max = Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>Max){
            Max = arr[i];
        }
       }
       System.out.println("the maximum element is " + " "+Max);
    }

    public static void SecondMax(int arr[]){
        int FirstMax = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            if(arr[i] > FirstMax){  
                SecondMax = FirstMax;
                 FirstMax = arr[i];
            }
            else if(arr[i]>SecondMax && arr[i]<FirstMax){
                SecondMax = arr[i];
            }
        }
        System.out.println("the secondmax is:" + " "+ SecondMax);
    }
     public static void SecondMin(int arr[]){
        int FirstMin = Integer.MAX_VALUE;
        int SecondMin = Integer.MAX_VALUE;
         for(int i =0;i<arr.length;i++){
            if(arr[i] < FirstMin){
                SecondMin = FirstMin;
                FirstMin = arr[i];
            }
            else if(arr[i]<SecondMin && arr[i] > FirstMin)
              SecondMin = arr[i];
         }
         System.out.println("the secondmin is:" + " "+SecondMin );
        
     }
    public static void main(String[] args) {
        int[] arr = init();
        display(arr);
        MIN(arr);
        MAX(arr);
        SecondMax(arr);
        SecondMin(arr);
       

        
    }
    
}
