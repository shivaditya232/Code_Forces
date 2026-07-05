import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rooms");
        int n=scanner.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter p");
            int p= scanner.nextInt();
            System.out.println("Enter q");
            int q= scanner.nextInt();
            if(p-q>=2){
                count+=1;

            }
            System.out.println(count);
        }
    }
}