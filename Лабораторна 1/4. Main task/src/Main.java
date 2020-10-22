import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter interval: ");
        int start = in.nextInt();
        int end = in.nextInt();

        Interval interval = new Interval(start, end);
        interval.PrintOddNumbers();
        interval.PrintReverseEvenNumbers();
        interval.PrintSumOfOddNumbers();
        interval.PrintSumOfEvenNumbers();

        int length;
        do {
            System.out.print("Enter Fibonacci series length (must be greater than 1): ");
            length = in.nextInt();
        } while (length < 2);
        interval.Fibonacci(length);
    }
}
