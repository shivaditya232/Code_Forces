import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int n= scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the a side");
            int a= scanner.nextInt();
            System.out.println("Enter the b side");
            int b= scanner.nextInt();
            int side=Math.min(Math.max(2*a,b),Math.max(a,2*b));
            System.out.println(side*side);
        }
    }
}