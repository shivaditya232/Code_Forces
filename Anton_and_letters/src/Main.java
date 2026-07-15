import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the set");
        String inp= scanner.nextLine();
        String ano=inp.substring(1,inp.length()-1);
        String[] alpha=ano.split(", ");
        String check="";
        int count=0;
        if(ano.isEmpty()){
            System.out.println(count);
        }
        else {
            for (String a : alpha) {

                if (!check.contains(a)) {
                    count += 1;
                    check += a;
                }
            }
            System.out.println(count);
        }
    }
}