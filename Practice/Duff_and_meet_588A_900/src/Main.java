import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of days");
        int n= scanner.nextInt();
        int cost=0;
        int minPrice=100000;
        for(int i=0;i<n;i++){
            System.out.println("Enter the number of kgs need for duff");
            int kg=scanner.nextInt();
            System.out.println("Enter the number of price per kg");
            int price= scanner.nextInt();
            if(kg*price<minPrice*kg){
                minPrice=price;
                cost+=kg*price;
            }
            else{
                cost+=minPrice*kg;
            }
        }
        System.out.println(cost);
    }
}