package fibonacci;


import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, first = 0, second = 1, next;

        System.out.print("Enter the number of terms: ");
        n = input.nextInt();

        System.out.print("Fibonacci Sequence: ");

        for (int i = 0; i < n; i++) {
            if (i <= 1)
                next = i; // first two terms are 0 and 1
            else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }

        System.out.println();
        input.close();
    }
}
