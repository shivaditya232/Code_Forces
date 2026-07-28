import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of stops");
        int n=scanner.nextInt();
        int min_capacity=0;
        int capacity=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the number of people who wants to exit");
            int exit= scanner.nextInt();
            capacity-=exit;
            System.out.println("Enter the number of people who wants to enter");
            int enter= scanner.nextInt();
            capacity+=enter;
            if(capacity>min_capacity){
                min_capacity=capacity;
            }
        }
        System.out.println(min_capacity);
    }
}