import java.util.Scanner;


public class Harshfun{
    public  static  boolean harsh(int num){
        int sum =0;
        int rem = 0;
        int no;
        no =num;
        while(num>0){
          rem = num%10;

          sum = sum+rem;
          num=num/10;
        }
        if(no%sum==0){
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
        boolean ch = harsh(num);
        System.out.println(ch);
    }

    
}
