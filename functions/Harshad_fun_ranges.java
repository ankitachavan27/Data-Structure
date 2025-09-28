import java.util.Scanner;

public class Harshad_fun_ranges {
    public static boolean harshad_func(int num){
        int sum =0;
        int rem ;
        int no = num;
        while(num>0){
            rem = num%10;
            sum = sum +rem;
            num = num/10;
        }
        if(no % sum == 0){
           return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
             boolean isHarshad = harshad_func(i);
             if(isHarshad){
                System.out.println(i);
             }
        }
        sc.close();
    }
    
}
