import java.util.Scanner;

public class wordcount_string {

    public static String reverseString(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 = s1 + s.charAt(i);
        }
        return s1;
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter the string:");
        String s1 = sc.nextLine(); 
        s1 = s1.trim(); 
        System.out.println(s1.isEmpty());
            for (int i = 0; i < s1.length() - 1; i++) {
                if (s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' ') {
                    count++;
                }
            }
             if (!s1.isEmpty()) {
             count = count + 1; 
             s1 =  reverseString(s1)+" "; 
        }
        System.out.println(s1);
        System.out.println(count);

       
    }
}
