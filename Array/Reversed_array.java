import java.util.Scanner;

public class Reversed_array {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter the size of array");
        size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.println("enter the data");
            arr[i] = sc.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
          
        }
          System.out.print("]");
            System.out.println(" ");

        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

       System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
            
        }
        System.out.print("]");
            System.out.print(" ");

    }
    
}
