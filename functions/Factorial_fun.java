import java.util.Scanner;

public class Factorial_fun {
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
        int ch =factorial(num);
        System.out.println(ch);
    }
    }
    

