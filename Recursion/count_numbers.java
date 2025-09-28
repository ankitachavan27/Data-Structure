import java.util.Scanner;

public class count_numbers {
    public static void Count(int num,int temp,int count){
        if(num == temp){
            return;
        }
        if(num%2==0){
            // System.out.println(num);
            count++;
            System.out.println("count is :"+count);
        }
       
        Count(num+1,temp,count+1);
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("enter the end number");
        int temp = sc.nextInt();
         Count(num,temp,0);
       

    }
    
}
