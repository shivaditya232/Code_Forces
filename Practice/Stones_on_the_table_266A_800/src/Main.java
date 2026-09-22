import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of stones in the table");
        int n= scanner.nextInt();
        scanner.nextLine();
        String store="";
        int count=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the string");
            String S= scanner.nextLine();
            if(store.isEmpty()){
                store=S;
            }
            else{
                if(S.equals(store)){
                    count+=1;
                }
                else{
                    store=S;
                }
            }
        }
        System.out.println(count);
    }
}