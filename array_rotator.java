import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotator {

    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return;
        
        // Handle rotations larger than array length
        d = d % n;
        if (d == 0) return;

        int[] temp = new int[n];

        // System.arraycopy(src, srcPos, dest, destPos, length)
        
        // 1. Copy elements from index 'd' to the end into the start of temp
        System.arraycopy(arr, d, temp, 0, n - d);

        // 2. Copy the first 'd' elements to the end of temp
        System.arraycopy(arr, 0, temp, n - d, d);

        // 3. Copy temp back to the original array
        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of positions to rotate: ");
        int d = sc.nextInt();

        rotateLeft(arr, d);

        System.out.println("Rotated array: " + Arrays.toString(arr));
        
        sc.close();
    }
}
