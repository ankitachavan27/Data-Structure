import java.util.Scanner;

public class area_of_circle {
    public static int squar(int s){
        return(s*s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("enter the r:");
        r = sc.nextInt();
       
        double area_circle = 3.14 * squar(r);
        System.out.println(area_circle);
    }
}
