import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string");
        String s=scanner.nextLine();
        if(s.length()==1){
            System.out.println(s);
        }
        else{
            String S="";
            String[] numbers=s.split("+");
            ArrayList<Integer> list = new ArrayList<>();
            for(String i:numbers){
                int n=Integer.parseInt(i);
                list.add(n);
            }
            Collections.sort(list);
            for(int i=0;i<list.size();i++){
                if(i==list.size()-1){
                    S+=list.get(i);
                }
                else{
                    S+=list.get(i)+"+";
                }
            }
            System.out.println(S);
        }

    }
}