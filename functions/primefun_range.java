import java.util.Scanner;


public class primefun_range {
    public  static  boolean prime(int num){
       
      for(int i=2;i<num;i++){
        if(num%i==0){
            return false;
        }
      }
      
        return true;
      
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        
        for(int i=2;i<=num;i++){
            boolean isPrime = prime(i);
            if(isPrime)
            System.out.println(i);
        }
       
    }
        
    }

    

