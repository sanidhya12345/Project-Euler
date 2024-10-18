import java.util.*;

public class LargestPrimeFactor {

    public static long maxPrime(long n){
        long max=Long.MIN_VALUE;
        while(n%2==0){
            max=2;
            n=n/2;
        }
        for(int i=3;i<Math.sqrt(n)+1;i+=2){
            while(n%i==0){
                max=i;
                n=n/i;
            }
        }
        return n>2 ? n : max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while (test--!=0) {
            long n=sc.nextLong();        
            System.out.println(maxPrime(n));
        }
        sc.close();
    }
}