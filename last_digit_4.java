// check if last digit of a number is 4 or  not.

package CP.Control_Statment;

import java.util.Scanner;

public class last_digit_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n % 10 == 4) {
            System.out.println("yes, last digit is 4");
        } else {
            System.out.println("No, your last digit is not 4");
        }
    }
}
