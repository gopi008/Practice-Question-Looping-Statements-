import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int reverseNumber = 0;
        while(n>0)
        {
            int temp = n % 10;
            reverseNumber = reverseNumber * 10 + temp;
            n /= 10;
        }
        System.out.print("Reversed number : " + reverseNumber);
    }
}
