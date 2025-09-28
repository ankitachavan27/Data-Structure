import java.util.Scanner;

public class fact_func {
    public static int fact(int num){
        int fact = 1;
        int start = 1;
        while(start<=num){
            fact = fact*start;
            start++;
        }
         return fact;
    
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("enter the number:");
        num = sc.nextInt();
        int factorial = fact(num);
        System.out.println(factorial);
    }
    
}
