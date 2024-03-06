import java.util.Scanner;

public class FibanocciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int tempsum = 0;
        int temp = 0;
        int next = 1;
        System.out.print(temp+" "+next+" ");
        while(tempsum < sum)
        {
            tempsum = temp + next;
            if(tempsum>sum) return;
            System.out.print(tempsum+" ");
            temp = next;
            next = tempsum;
        }
    }
}
