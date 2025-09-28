import java.util.Scanner;


public class Primefun {
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
        boolean ch = prime(num);
        System.out.println(ch);
    }

    
}
