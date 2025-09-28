import java.util.Scanner;

public class armstrong_func_range {
    public static int  cube(int num){
        return num*num*num;
     }
     public static boolean armstrong_func(int num){
        int no = num;
        int sum = 0;
        while(num>0) {
            int rem =num % 10;
            sum =sum + cube(rem);
            num =num/10;
        }
       if(no == sum){
        return true;
           }
           else{
            return false;
           }
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            boolean isautomorphic = armstrong_func(i);
            if(isautomorphic){
                System.out.println(i);
            }
        }
        
         
     }

    
}
