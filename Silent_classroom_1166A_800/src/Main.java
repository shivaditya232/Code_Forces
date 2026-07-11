import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println("Enter the number of elements you want to add");
        int n= scanner.nextInt();
        scanner.next();
        System.out.println("Enter the first word");
        String s=scanner.nextLine();
        list1.add(s);
        for(int i=0;i<n-1;i++){
            System.out.println("Enter the word");
            String s1=scanner.nextLine();
            for(int j=0;j<list1.size();j++){
                if(s1.charAt(0)==list1.get(j).charAt(0)){
                    for(int k=0;k<list2.size();k++){
                        if(s1.charAt(0)==list2.get(k).charAt(0)){

                        }
                    }
                }
                else{
                    list1.add(s1);
                }
            }

        }

    }
}