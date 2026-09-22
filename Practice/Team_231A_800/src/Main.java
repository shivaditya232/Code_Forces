import java.util.Scanner;

public class Main {
  static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number of problems");
    int n= scanner.nextInt();
    int problems=0;
    for(int i=0;i<n;i++){
      int count=0;
      System.out.println("Enter petya's view");
      count+= scanner.nextInt();
      System.out.println("Enter vasya's view");
      count+= scanner.nextInt();
      System.out.println("Enter tonya's view");
      count+= scanner.nextInt();
      if(count>=2){
        problems+=1;
      }
    }
    System.out.println(problems);
  }
}