import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of persons");
        int n=scanner.nextInt();
        String s="";
        for(int i=0;i<n;i++){
            System.out.println("Enter either 1 or 0");
            int choice= scanner.nextInt();
            s+=choice+"";
        }
        if(s.contains("1")){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}