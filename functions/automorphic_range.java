import java.util.Scanner;

public class automorphic_range{
    public static  boolean automorphic_func(int num){
        int square = num*num;
        while(num>0){
            int lastdigit = num%10;
            int squaredigit = square%10;
            if(lastdigit!=squaredigit){
                return false;
            }
            num = num/10;
            square = square/10;

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            boolean isautomorphic =automorphic_func (i);
            if(isautomorphic ){
                System.out.println(i);
        }
    }
    }
}