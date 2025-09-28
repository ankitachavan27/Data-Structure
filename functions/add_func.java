import java.util.Scanner;
public class add_func {
    // public static void add(int a,int b){
    //    System.out.println(a+b ); 
    //     return ;
    //     }
    // public static int add(int a,int b){
    //     return(a+b);
    // }
    // public static float add(float a,int b){
    //     return (a+b);
    // }
    public static double add(double a,int b){
        return (a+b);
    }

    public static void main(String[] args) {
        // add(10,20);
        // int a =add(20,30);
        // System.out.println(a);
        
    //    float c= add(10.5f,20);
    //    System.out.println(c);
    
    double d = add(30.4,21);
    int a;
    int b;
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the a: ");
     a= sc.nextInt();
    System.out.println("enter the b: ");
     b= sc.nextInt();

    System.out.println(d);

    
        
    }
}
