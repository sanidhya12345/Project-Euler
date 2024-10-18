import java.util.*;
public class SumSquareDifference {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test--!=0){
            long n=sc.nextLong();
            long firstHalf= (n*(n+1))/2;//(n*(n+1))/2
            long secondHalf=((3*n*n)-n-2)/6;
            System.out.println(firstHalf*secondHalf);                 
        }
        sc.close();
    }
}