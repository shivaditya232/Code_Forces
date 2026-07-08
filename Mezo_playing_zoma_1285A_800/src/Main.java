import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of inputs");
        int n= scanner.nextInt();
        System.out.println("Enter the word");
        String s=scanner.nextLine();
        int countL=0;
        int countR=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)+""=="L"){
                countL+=1;
            }
            if(s.charAt(i)+""=="R") {
                countR += 1;
            }
        }
        System.out.println(countL+countR+1);
    }
}