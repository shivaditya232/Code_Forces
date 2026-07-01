import java.util.Scanner;

public class Main{
    public static long hcf(long a, long b) {
        if (b == 0) return a;
        return hcf(b, a % b);
    }
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        long n=scanner.nextInt();
        System.out.println("Enter k");
        long k=scanner.nextInt();
        long power = (long)Math.pow(10, k);
        long lcm = (n * power) / hcf(n, power);
        System.out.println(lcm);
    }
}