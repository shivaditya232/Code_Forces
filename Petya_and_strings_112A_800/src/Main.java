import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1=scanner.nextLine();
        System.out.println("Enter the second word");
        String word2=scanner.nextLine();
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        boolean flag1=true;
        boolean flag2=true;
        boolean flag3=true;
        if(word1.equals(word2)){
            System.out.println(0);
            flag2=false;

        }
        for(int i=0;i<word1.length();i++){
            if(word1.charAt(i)>word2.charAt(i)){
                flag1=false;
                break;
            }
            else if(word1.charAt(i)<word2.charAt(i)){
                flag3=false;
                break;
            }
        }
        if(flag1 && flag2 && !flag3){
            System.out.println(-1);
        }
        else{
            System.out.println(1);
        }
    }
}