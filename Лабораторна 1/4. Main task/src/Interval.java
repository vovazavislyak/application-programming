/**
 *  Class represent interval with properties <b>start</b> and <b>end</b>
 * */

public class Interval {
    /** Field start */
    private int start;
    /** Field end */
    private int end;

    /**
     * Constructor - create new object with specific values
     * @param start beginning of the interval
     * @param end end of the interval
     * */
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Method prints odd numbers from the interval in ascending order
     * */
    public void PrintOddNumbers() {
        for (int i = start % 2 == 1 ? start : start + 1;
             i <= end; i += 2)
            System.out.print(i + " ");
        System.out.println();
    }

    /**
     * Method prints even numbers from the interval in reverse order in descending order
     * */
    public void PrintReverseEvenNumbers() {
        for (int i = end % 2 == 0 ? end : end - 1;
             i >= start; i -= 2)
            System.out.print(i + " ");
        System.out.println();
    }

    /**
     * Method calculate sum of the arithmetic progression
     * @param first first member of the arithmetic progression
     * @param last last member of the arithmetic progression
     * @return sum of the arithmetic progression
     * */
    private int Sum(int first, int last) {
        int n = (last - first) / 2 + 1;
        return (first + last) / 2 * n;
    }

    /**
     * Method prints sum of odd numbers from the interval
     * */
    public void PrintSumOfOddNumbers() {
        int first = start % 2 == 1 ? start : start + 1;
        int last = end % 2 == 1 ? end : end - 1;

        System.out.println("Sum of odd numbers: " + Sum(first, last));
    }

    /**
     * Method prints sum of even numbers from the interval
     * */
    public void PrintSumOfEvenNumbers() {
        int first = start % 2 == 0 ? start : start + 1;
        int last = end % 2 == 0 ? end : end - 1;

        System.out.println("Sum of even numbers: " + Sum(first, last));
    }

    /**
     * Method prints Fibonacci series and prints the percentage of odd and even numbers in series
     * First member - the biggest odd number from the interval
     * Second member - the biggest even number from the interval
     * @param length series length
     * */
    public void Fibonacci(int length)
    {
        int first = end % 2 == 1 ? end : end - 1;
        int second = end % 2 == 0 ? end : end - 1;

        int evenNumCount = 1, oddNumCount  = 1;

        System.out.print("Fibonacci series: ");
        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= length; i++) {
            int current = first + second;
            System.out.print(current + " ");

            if (current % 2 == 0) evenNumCount++;
            else oddNumCount++;

            first = second;
            second = current;
        }

        System.out.println("\nThe percentage of odd numbers in series: " + (double)oddNumCount / length);
        System.out.println("The percentage of even numbers in series: " + (double)evenNumCount / length);
    }
}