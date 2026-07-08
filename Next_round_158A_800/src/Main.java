import java.util.Scanner;
public class Main{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        int n= scanner.nextInt();
        System.out.println("Enter k");
        int k=scanner.nextInt();
        scanner.next();
        System.out.println("Enter the points");
        String points= scanner.nextLine();
        String[] array=points.split(" ");
        int count=0;
        for(int i=0;i<n;i++){
            if (Integer.parseInt(array[i])>=Integer.parseInt(array[k-1])&& Integer.parseInt(array[i]) > 0){
                count+=1;
            }
        }
        System.out.println(count);

    }
}