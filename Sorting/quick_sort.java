import java.util.Scanner;

public class quick_sort {
       public static  Scanner sc = new Scanner(System.in);
      public static int[] init(){
       
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
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i =low-1;
        for(int j= low;j<=high-1;j++){
            if(arr[j]<=pivot){
                i=i+1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        int temp =arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);

        }
    }
    public static void main(String[] args) {
        int arr[] = init();
        display(arr);
        quicksort(arr,0,arr.length-1);
        display(arr);
    }
}
