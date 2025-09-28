import java.util.Scanner;

public class Strong_func_range {
    public static  int fact_fun(int num){
        int fact =1;
        int i =1;
        while(i<=num){
            fact =  fact * i;
             i++;
        }
        return fact;
    }
    public static boolean  Strong(int num){
        int rem;
        int sum=0;
        int no = num;
        while(num>0){
            rem = num%10;
            sum = sum + fact_fun(rem);
            num = num/10;
        }
        return sum == no;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            boolean isStrong = Strong(i);
            if(isStrong){
                System.out.println(i);
            }
        }

    }

    
}
