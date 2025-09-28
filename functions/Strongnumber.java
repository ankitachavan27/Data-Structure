import java.util.Scanner;

public class Strongnumber {
    public static int factorial(int num){
        int fact = 1;
        int start = 1;
        while(start<=num){
         fact = fact*start;
         start++;

        }
      return fact;

    }
    public static boolean Strong(int num) {
        int sum = 0;
        int no = num;

        while(num>0) {
            int rem =num % 10;
            sum =sum + factorial(rem);
            num =num/10;
        }

        return sum == no;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        boolean isStrong = Strong(num);
        System.out.println(isStrong);
    }
}
