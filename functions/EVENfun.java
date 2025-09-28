import java.util.Scanner;

public class EVENfun {
    public static boolean check( int a){
    
        return a%2==0 ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        boolean ch = check(a);
        System.out.println(ch);
    }
    
}
