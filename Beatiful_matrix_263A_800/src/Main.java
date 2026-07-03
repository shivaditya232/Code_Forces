// https://codeforces.com/problemset/problem/263/A
import java.util.Scanner;
public class Main{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] matrix = new int[5][5];
        System.out.println("Enter the row you want to make 1");
        int r= scanner.nextInt();
        System.out.println("Enter the column you want to make 1");
        int c= scanner.nextInt();
        matrix[r][c]=1;
        int count=0;
        int col=0;
        int row=0;
        col=Math.abs(c-2);
        row=Math.abs(r-2);
        count=col+row;
        System.out.println(count);
    }
}