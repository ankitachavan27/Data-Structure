import java.util.Scanner;

public class Even_func_range {
    public static boolean check( int a){
    
        return a%2==0 ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            boolean result = check(i);
            System.out.println(i+"="+result);
        }
       
    }
    
}
