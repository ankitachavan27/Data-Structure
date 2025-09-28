import java.util.Scanner;


public class ARMfun{
    public  static  boolean armstrong(int num){
        int sum =0;
        int rem = 0;
        int no;
        no =num;
        while(num>0){
          rem = num%10;
          System.out.println(rem);
          sum = sum+(rem*rem*rem);
          num=num/10;
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
        boolean ch = armstrong(num);
        System.out.println(ch);
    }

    
}
