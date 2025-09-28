import java.util.Scanner;

public class selection_sort {
    
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

    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
                
            }
            int temp =  arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }


    }
  public static void main(String args[]){
        int arr[] = init();
        display(arr);
        selectionsort(arr);
        display(arr);

    }
}
