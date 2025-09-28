import java.util.Scanner;


public class Neonfun_range{
    public  static  boolean neon(int num){
        int sum =0;
        int rem = 0;
        int no;
        no =num;
        int no1 =num*num;
        while(no1>0){
          rem = no1%10;

          sum = sum+rem;
          no1=no1/10;
        }
        if(sum==no){
            return true;
        }
        else{
          return false;
        }
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        for(int i=1;i<=num;i++){
            boolean isNeon =neon(i);
            if(isNeon){
            System.out.println(i);
            }

        }
    }

    
}
