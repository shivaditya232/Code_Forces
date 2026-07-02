import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of cans");
        int n=scanner.nextInt();
        int total=0;
        int firstmax=0;
        int secondmax=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the remaining cola");
            total+= scanner.nextInt();
        }
        for(int j=0;j<n;j++){
            System.out.println("Enter the capacity of the cola");
            int cap= scanner.nextInt();
            if(cap>firstmax){
                secondmax=firstmax;
                cap=firstmax;
            }
            else if(cap>secondmax){
                secondmax=cap;
            }
        }
        if(total>firstmax+secondmax){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}