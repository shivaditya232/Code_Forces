import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of elements in the array");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the element");
            int ele= scanner.nextInt();
            list.add(ele);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ele = list.get(i);
            int idx = result.indexOf(ele);
            if (idx != -1)
                result.remove(idx);
            result.add(ele);
        }

        System.out.println(result.size());
        System.out.println(result);
    }
}