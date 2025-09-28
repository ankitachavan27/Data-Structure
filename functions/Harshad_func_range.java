import java.util.Scanner;

public class Harshad_func_range {
    public static boolean harshad(int num) {
        int sum = 0;
        int rem;
        int no = num;

        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        if (no % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        System.out.println("Harshad numbers from 1 to " + num + ":");
        for (int i = 1; i <= num; i++) {
            boolean isHarshad = harshad(i);
            if (isHarshad) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
