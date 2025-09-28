import java.util.Scanner;

public class trim_function {

    public static String trim_fun(String s){
            int space = " ";
            String s1 =" ";
            
            for(char i=0;i<s.length();i++){
              if(s.charAt(i)==space){
                s1 =s1+
              }else{
                s1 = s1+s.charAt(i);
              }

                

                
            }






        return s1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s1 = sc.next();
        String s = trim_fun(s1);
        System.out.println(s);

        
    }
    
}
