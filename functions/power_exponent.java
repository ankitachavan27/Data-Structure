import java.util.Scanner;

public class power_exponent {
    public static  int Power(int base,int exponent){
        int power =1;
        while(exponent>0){
            power = power * base;
            exponent--;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b,e;
        System.out.println("enter the base:");
        b = sc.nextInt();
        System.out.println("enter the exponent");
        e = sc .nextInt();
        int power = Power(b,e);
        System.out.println(power);

        
    }

    
}
