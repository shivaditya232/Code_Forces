import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of days");
        int n= scanner.nextInt();
        System.out.println("Enter the sequence");
        String seq= scanner.nextLine();
        String[] sequence=seq.split(" ");
        int count=0;
        int res=0;
        int prev=Integer.parseInt(sequence[0]);
        for(int i=0;i<sequence.length;i++){
            if(Integer.parseInt(sequence[i])>=prev){
                count+=1;
            }
            else{
                count=1;
            }
            if(res<=count){
                res=count;
            }
            prev=Integer.parseInt(sequence[i]);
        }
    }
}