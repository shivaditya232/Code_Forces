import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the weight of limak");
        int lim= scanner.nextInt();
        System.out.println("Enter bob weight");
        int bob= scanner.nextInt();
        int count=1;
        while(true){
            if(lim*3>bob*2){
                System.out.println(count);
                break;
            }
            else{
                lim=lim*3;
                bob=bob*2;
                count+=1;
            }
        }
    }
}