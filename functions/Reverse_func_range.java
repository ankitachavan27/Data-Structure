import java.util.Scanner;


public class Reverse_func_range{
    public  static  int  reverse(int num){
        int rev =0;
        int rem =0;
        
        
        while(num>0){
          rem = num%10;
          rev = rev*10+rem;
          num=num/10;
        }
        return rev;
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        for(int i=1;i<=num;i++){
            int result = reverse(i);
            System.out.println(i+"="+result);
        }
        
    }

    
}
