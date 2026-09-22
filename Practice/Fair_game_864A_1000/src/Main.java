import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of cards");
        int n= scanner.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        boolean check=true;
        int ele1=1;
        int ele2=1;
        for(int i=0;i<n;i++){
            System.out.println("Enter the element");
            int ele= scanner.nextInt();
            if(list.contains(ele)){
                if(list.indexOf(ele)==1){
                    ele2++;
                } else if (list.indexOf(ele)==0) {
                    ele1++;
                }

            }
            else{
                count+=1;
                list.add(ele);
            }
        }
        if(count>2){
            System.out.println("NO");
            check=false;

        }
        if(check){
            if(n/2==ele1 && n/2==ele2) {
                System.out.println("YES");
                System.out.println(list.get(0) + " " + list.get(1));
            }
            else{
                System.out.println("NO");
            }
        }

    }
}