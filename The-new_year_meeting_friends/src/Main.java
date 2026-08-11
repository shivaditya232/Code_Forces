import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the point of x1");
        int x= scanner.nextInt();
        System.out.println("Enter the point of x2");
        int y= scanner.nextInt();
        System.out.println("Enter the point of x3");
        int z= scanner.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(x);
        list.add(y);
        list.add(z);
        Collections.sort(list);
        int mid=list.get(1);
        System.out.println(Math.abs(list.get(0)-mid)+Math.abs(list.get(2)-mid));
    }
}