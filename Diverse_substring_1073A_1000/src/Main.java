import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the string");
        int n= scanner.nextInt();
        System.out.println("Enter the string");
        String s=scanner.nextLine();
        boolean allSame=true;
        for(int i=0;i<n;i++){
            if(s.charAt(0)!=s.charAt(i)){
                allSame=false;
                break;
            }
        }
        if(allSame){
            System.out.println("NO");
        }
        else {
            String substring = "";
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    substring=""+ s.charAt(i) + s.charAt(i + 1);
                    break;
                }

            }
            System.out.println("YES");
            System.out.println(substring);
        }
    }
}