import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sumOfDigits = 0;
        while(n>0)
        {
            int temp = n % 10;
            sumOfDigits += temp;
            n /= 10;
        }
        System.out.print("Sum of digits : " + sumOfDigits);
    }
}
