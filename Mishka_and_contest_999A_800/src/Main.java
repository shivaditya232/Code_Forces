import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of problems");
        int n= scanner.nextInt();
        System.out.println("Enter the maximum level he can solve");
        int k= scanner.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter the element");
            int ele= scanner.nextInt();
            list.add(ele);
        }
        int count=0;
        while(list.size()>0){
            boolean flag=false;
            if(list.get(0)<=k){
                count+=1;
                list.remove(0);
                flag=true;
            }
            else if(list.get(list.size()-1)<=k){
                count+=1;
                list.remove(list.size()-1);
                flag=true;
            }
            if(!flag){
                break;
            }
        }
        System.out.println(count);
    }
}