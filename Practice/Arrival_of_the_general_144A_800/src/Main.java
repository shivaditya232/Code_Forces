import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numebr of soldiers");
        int n= scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int min=101;
        int minIndex=0;
        int count=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the soldier height");
            int height= scanner.nextInt();
            list.add(height);
            if(height<=min){
                min=height;
                minIndex=i;
            }
        }
        int maxIndex=list.indexOf(Collections.max(list));
        count+=list.size()-1-minIndex;
        count+=maxIndex;
        if(minIndex-maxIndex<0){
            count-=1;
        }
        System.out.println(count);
    }
}