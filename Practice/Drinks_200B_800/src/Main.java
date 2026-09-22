import java.util.Scanner;

public class Main {
  static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number of drinks in the fridge");
    double n=scanner.nextDouble();
    double perc= 0;
    for(int i=0;i<n;i++){
      System.out.println("Enter the percent");
      double cent= scanner.nextDouble();
      perc+=cent;
    }
    System.out.println(perc/n);
  }
}