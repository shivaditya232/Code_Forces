import java.util.Scanner;

public class Main {
  static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number of cubes");
    int n= scanner.nextInt();
    int count=0;
    int height=1;
    int print=0;
    while(n>0){
      count=height*(height+1)/2;
      if(n>=count){
        height+=1;
        print+=1;
        n-=count;
      }
      else {
        break;
      }
    }
    System.out.println(print);

  }
}