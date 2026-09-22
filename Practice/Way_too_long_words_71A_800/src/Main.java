import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of words");
        int n=scanner.nextInt();
        scanner.next();
        for(int i=0;i<n;i++){
            System.out.println("Enter the word");
            String s=scanner.nextLine();
            if(s.length()>10) {
                String result = "";
                int length = s.length()-2;
                result = ""+s.charAt(0)+length+s.charAt(s.length()-1);
                System.out.println(result);
            }
            else{
                System.out.println(s);
            }
        }
    }
}