import java.util.Scanner;
public class Main{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of statements");
        int st=scanner.nextInt();
        int x=0;
        scanner.next();
        for(int i=0;i<st;i++){
            System.out.println("Enter the statement");
            String sta=scanner.nextLine();
            if(sta.contains("++")){
                x+=1;
            }
            else if(sta.contains("--")){
                x-=1;
            }
        }
        System.out.println(x);
    }
}