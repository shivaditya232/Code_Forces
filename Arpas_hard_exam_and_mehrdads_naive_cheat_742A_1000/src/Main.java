import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        int n= scanner.nextInt();
        if(n==0){
            System.out.println(1);
        } else if (n%4==1) {
            System.out.println(8);
        }
        else if(n%4==2){
            System.out.println(4);
        } else if (n%4==3) {
            System.out.println(2);
        }
        else{
            System.out.println(6);
        }
    }
}