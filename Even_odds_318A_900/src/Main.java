import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        int n= scanner.nextInt();
        System.out.println("Enter k");
        int k= scanner.nextInt();
        int oddCount=0;
        if(n%2==0){
            oddCount=n/2;
        }
        else{
            oddCount=(n+1)/2;
        }
        if(k<=oddCount){
            System.out.println(2*k-1);
        }
        else{
            System.out.println(2*(k-oddCount));
        }
    }
}