import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the original number");
        int n= scanner.nextInt();
        System.out.println("Enter the desired number");
        int m= scanner.nextInt();
        int count=0;
        while(n!=m){
            if(m%n==0) {
                if (m % (n * 3) == 0) {
                    n = n * 3;
                    count+=1;
                }
                else if(m%(n*2)==0){
                    n=n*2;
                    count+=1;
                }
                else{
                    count=-1;
                    break;
                }
            }
            else{
                count=-1;
                break;
            }
        }
        System.out.println(count);
    }
}