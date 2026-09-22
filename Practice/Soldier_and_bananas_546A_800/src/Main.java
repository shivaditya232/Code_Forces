import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the cost of first banana");
        int cost= scanner.nextInt();
        System.out.println("Enter the money the soldier has");
        int money= scanner.nextInt();
        System.out.println("Enter the number of bananas he wants");
        int number= scanner.nextInt();
        int mon=cost*(number*(number+1))/2-money;
        if(mon<0){
            mon=0;
        }
        System.out.println(mon);

    }
}