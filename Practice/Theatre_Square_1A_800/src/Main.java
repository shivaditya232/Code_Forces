import java.util.Scanner;
public class Main{
    static void findCount(int n,int m,int a) {
        int count=0;
        int loop=0;
        if (a >= n) {
            count = 1;
            m = m - a;
            while (m > 0) {
                count += 1;
                m = m - a;
            }
            System.out.println(count);
        } else if (a < n) {
            while (n > 0) {
                count += 1;
                loop+=1;
                n = n - a;

            }
            m = m - a;
            while (m > 0) {
                count += 1;
                m = m - a;
            }
        }
        System.out.println(count*loop);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= scanner.nextInt();
        System.out.println("Enter the value of m");
        int m=scanner.nextInt();
        System.out.println("Enter the value of a");
        int a=scanner.nextInt();
        if(n>m){
            int temp=m;
            m=n;
            n=temp;


        }
        findCount(n,m,a);
    }
}