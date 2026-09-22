import java.util.Scanner;

public class Main{
  static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the position you want to move");
    int pos= scanner.nextInt();
    int count=pos/5;
    int remainder=pos-count*5;
    if(remainder>0 && remainder<5){
      count+=1;
    }
    System.out.println(count);
  }
}