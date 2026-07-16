import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of inputs you want to give");
        int n= scanner.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter the width");
            int w= scanner.nextInt();
            System.out.println("Enter the height");
            int h=scanner.nextInt();
            System.out.println("enter the number of sheets you want");
            int s= scanner.nextInt();
            int sheetNo=1;
            while(w%2==0){
                sheetNo*=2;
                w=w/2;
            }
            while(h%2==0){
                sheetNo*=2;
                h=h/2;
            }
            if(s==1){
                System.out.println("YES");
            }
            else if(sheetNo>s){
                System.out.println("YES");
            }
            else if(sheetNo<s){
                System.out.println("NO");
            }
        }
    }
}