import java.util.Scanner;

public class exponent_recursion {
    public static int exponent(int base,int expo,int power){
    
        if(expo == 0){
            return power;
        }
        power = power*base;
        return exponent(base,expo-1,power);
        }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the base");
       int base = sc.nextInt();
       System.out.println("enter the exponent");
       int expo = sc.nextInt();
       int isExponent = exponent(base,expo,1);
       System.out.println(isExponent);

   }
    
}
