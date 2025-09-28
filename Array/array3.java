import java.util.Scanner;

public class array3 {

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

    public static void SumOfArray(int[] arr){
        int sum =0;
         for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            

         }
         System.out.println("Sum is:" + sum);
    }

    public static void SumOfEven(int[] arr){
        int sum =0;
        
         for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
             sum= sum+arr[i];
        }
    }
    System.out.println("sum of even numbers is:" + sum);
    }

    public static void SumOfOdd(int[] arr){
        int sum =0;
        
         for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
             sum= sum+arr[i];
        }
    }
    System.out.println("sum of odd numbers is:" + sum);
    }

    public static void ISprime(int arr[]){
       
        for(int i=0;i<arr.length;i++){
              int count=0;
            
          for(int j=2;j<arr[i];j++){
           
            if(arr[i]%j==0){
                count++;
            }
          }
          if(count==0){
            System.out.println("number " + arr[i]+  " is prime");
          }
       
        }
        System.out.println();
    }
    public static boolean isSpy(int no){
      
            int rem =0;
            int fact = 1;
            int sum =0;
            while(no>0){
                rem = no%10;
                sum = sum + rem;
                fact = fact * rem;
                 no = no/10;

            }
           
           
        return sum == fact;
          
    }

    public static boolean isNeon(int no){
        int rem =0;
        int sum=0;
        int original = no;
        int no1 = no*no;
        while(no1>0){
            rem = no1%10;
            sum = sum +rem;
            no1 = no1/10;

        }
        return  original == sum;
    
    
    }
    public static boolean automorphic(int num){
        int square = num*num;
        while(num>0){
            int lastdigit = num%10;
            int squarelastdigit = square%10;
            if(lastdigit!=squarelastdigit){
                return  false;
            }
            num = num/10;
            square = square/10;

        }
        return true;
        
    }
    // public static boolean isPerfect(int no){
    //     int original = no;
    //     int sum =0;
    //     for(int i=1;i<no;i++){
    //         if(no%i==0){
    //             sum = sum+i;
    //         }

    //     }
    //     if(sum == original){
    //         return true;
    //     }

    // }
 public static boolean isHarshad(int no){

        int sum=0;
        int rem =0;
        int  num = no;
        while(no>0){
          rem =no%10;
          sum = sum + rem;
          no = no/10;
    }
    return num%sum==0;
}
    public static void checkNumbers(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(isNeon(arr[i])){
                System.out.println(" Neon" +" "+ arr[i]);
            }
            if(isHarshad(arr[i])){
            System.out.println("Harshad" + " "+arr[i]);
        }
            if(automorphic(arr[i])){
                System.out.println("Automorphic" + "  "+arr[i]);
            }
        
        }
    }



   


    public static void main(String args[]){

       int[] arr = init();
       display(arr);
       SumOfArray(arr);
       SumOfEven(arr);
       SumOfOdd(arr);
       ISprime(arr);
         checkNumbers(arr);
     for(int i=0;i<arr.length;i++){
      if(isSpy(arr[i])){
        System.out.println(" SPY" +" "+ arr[i]);
      }
       }
      

    }
    
}
