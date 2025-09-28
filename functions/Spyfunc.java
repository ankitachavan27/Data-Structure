import java.util.Scanner;


public class Spyfunc{
    public  static  boolean spy(int num){
        int sum =0;
        int rem = 0;

        int fact =1;
        while(num>0){
          rem = num%10;

          sum = sum+rem;
          fact = fact*rem;
          num=num/10;
        }
        if(fact == sum){
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
        boolean ch = spy(num);
        System.out.println(ch);
    }

    
}
