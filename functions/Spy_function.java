import java.util.Scanner;

public class Spy_function {
    public static boolean Spy(int num){
        int fact = 1;
        int sum =0;
        while(num>0){
            int rem = num%10;
            sum = sum +rem;
            fact = fact *rem;
            num = num/10;
        }
        if( sum==fact){
            return true;
        }
        else{
            return false;
        }
       

    }
     public static void main(String args[]){
            Scanner sc = new Scanner (System.in);
            System.out.println("enter the number:");
            int num = sc.nextInt();
            boolean Spyfunc =Spy(num);
            System.out.println(Spyfunc);
        }
    
}
