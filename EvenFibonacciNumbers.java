import java.io.*;
import java.util.*;

public class EvenFibonacciNumbers {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
    int t = in.nextInt();
   for(int a0 = 0; a0 < t; a0++){
        long n = in.nextLong();  // Read the limit N for this test case
        long sum = 0;

        // Starting the Fibonacci sequence
        long a = 1, b = 2;

        // Calculate the sum of even Fibonacci numbers not exceeding N
        while (b <= n) {
            if (b % 2 == 0) {
                sum += b;
            }

            // Generate the next Fibonacci number
            long next = a + b;
            a = b;
            b = next;
        }

        // Output the result for this test case
        System.out.println(sum);
    }

    in.close(); 
    }
}
