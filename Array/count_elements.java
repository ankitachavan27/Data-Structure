import java.util.Scanner;

public class count_elements {
     
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
    public static boolean elementFound(int[] arr,int key) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    public static void Count_element(int arr[]){
        int arr1[] = new int[arr.length]; 
        int k=0;
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(!elementFound(arr1, element)){
               
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==element){
                    count++;
                }

            }
            System.out.println("the count of " +arr[i] +"is "+ count);
            arr1[k]=element;
            k++;
        }
            
        }

    }
    public static void main(String[] args) {
        int arr[] = init();
        display(arr);
        Count_element(arr);
        
        
    }
    
}
