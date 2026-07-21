import java.util.Scanner;

public class Main {
  static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number of polygons you want to check");
    int n= scanner.nextInt();
    for(int i=0;i<n;i++){
      System.out.println("Enter the number of sides in the polygon");
      int poly= scanner.nextInt();
      if(poly>=4 && poly%4==0){
        System.out.println("Yes");
      }
      else{
        System.out.println("False");
      }
    }
  }
}