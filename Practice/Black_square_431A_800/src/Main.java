import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of calories burnt for 1st strip");
        int one= scanner.nextInt();
        System.out.println("Enter the number of calories burnt for 2nd strip");
        int two= scanner.nextInt();
        System.out.println("Enter the number of calories burnt for 3rd strip");
        int three= scanner.nextInt();
        System.out.println("Enter the number of calories burnt for 4th strip");
        int four= scanner.nextInt();
        System.out.println("Enter the string");
        String s= scanner.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count+=one;
            }
            else if(s.charAt(i)=='2'){
                count+=two;
            }
            else if(s.charAt(i)=='3'){
                count+=three;
            }
            else{
                count+=four;
            }

        }
        System.out.println(count);
    }
}