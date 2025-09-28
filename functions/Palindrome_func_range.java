import java.util.Scanner;

public class Palindrome_func_range {
    public static boolean palindrome(int num){
        int rev =0;
        int rem = 0;
        int no = num;
        
        while(num>0){
          rem = num%10;
          rev = rev*10+rem;
          num=num/10;
        }
        if(no == rev){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        for (int i=1;i<=num;i++){
            boolean isPalindrome =palindrome(i);
            if(isPalindrome){
            System.out.println(i);
            }
        }
        
    }
    
}
