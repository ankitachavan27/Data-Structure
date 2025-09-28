import java.util.Scanner;


public class Leapfun {
    public  static  boolean leap(int year){

        if(year%4==0 &&(year%100!=0 || year%400==0)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year:");
        int year= sc.nextInt();
        boolean ch = leap(year);
        System.out.println(ch);
    }

    
}
