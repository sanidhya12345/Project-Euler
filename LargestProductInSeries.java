import java.io.*;
import java.util.*;
public class LargestProductInSeries {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        long maxProduct = 0;

        for (int i = 0; i <= n - k; i++) {
            long product = 1;
            for (int j = 0; j < k; j++) {
                product *= Character.getNumericValue(number.charAt(i + j));
            }
            maxProduct = Math.max(maxProduct, product);
        }
        System.out.println(maxProduct);
    }
    in.close();
    }
}
