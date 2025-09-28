import java.util.Scanner;

public class sum_of_all_numbers {
    public static int Sum(int no){
        int sum = 0;
        int rem;

        while(no>0){
            rem = no%10;
            sum = sum + rem;
            no = no/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        int  sum = Sum(num);
        System.out.println(sum);



    }
    
}
