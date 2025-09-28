    import java.util.Scanner;
    
    public class insertion_sort{      
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
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            
   
            }
             arr[j+1] = key;
              
        }
    }

    public static void main(String args[]){
        int arr[]  = init();
        display(arr);
        insertionsort(arr);
        display(arr);

    }
    }