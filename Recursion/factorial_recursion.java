import java.util.Scanner;
public class factorial_recursion {
    public static int Factorial(int num){
         if(num == 0 || num == 1 ){
            return 1;
         }
         return num* Factorial(num-1);
      
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        int f = Factorial(num);
        System.out.println(f);
        
       
    }
}

