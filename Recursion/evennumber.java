import java.util.Scanner;

public class evennumber {
    public static void display(int num,int temp){
        if(num == temp){
            return;
        }
        
        if(num%2==0 ){
            System.out.println(num);
        }
        
        display(num+1,temp);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        System.out.println("enter the end number");
        int  temp = sc.nextInt();
        display(num,temp);
        
    }
    
}
