import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String s= scanner.nextLine();
        String res="";
        int count=0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)+""+s.charAt(i+1)=="aa"){
                String add="ab";
                res+=add;
                count+=1;
            } else if (s.charAt(i)+""+s.charAt(i+1)=="bb") {
                String add="ab";
                res+=add;
                count+=1;
            }
            else{
                String add=s.substring(i,i+2);
                res+=add;
            }
        }
        System.out.println(count);
        System.out.println(res);
    }
}