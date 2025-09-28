import java.util.Scanner;

public class area_of_triangle{
    // public static double area(double height,int base){
    //     return(0.5*height*base);
    // }
    public static int area(int length,int breadth ){
        return (length*breadth);
    }
    public static void main(String args[]){
        
        double Triangle_area = 0.5 * area(10,20);
         System.out.println(Triangle_area);
        int Rectangle_area = area(20,30);
        System.out.println(Rectangle_area);
    //     double Triangle_area = area(20,15);
    //     System.out.println(Triangle_area);
    // }
    }
}