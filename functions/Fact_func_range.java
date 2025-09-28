import java.util.Scanner;

public class Fact_func_range {
    public static int factorial(int num){
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
        System.out.println("enter the number :");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            int factor = factorial(i);
            System.out.println(i +"!="+factor);

        }
        
    }
    }
    

