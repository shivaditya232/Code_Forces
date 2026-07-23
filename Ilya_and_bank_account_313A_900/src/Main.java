import java.util.Scanner;

public class Main {
  static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number");
    int num= scanner.nextInt();
    if(num>=0){
      System.out.println(num);
    }
    else{
      int last_digit=Math.abs(num%10);
      int second_last=Math.abs((num/10)%10);
      String number=num+"";
      if(second_last<last_digit){
        System.out.println(number.substring(0,number.length()-1));
      }
      else{
        String res="";
        for(int i=0;i<number.length();i++){
          if(i==number.length()-2){
            continue;
          }
          else{
            res+=number.charAt(i);
          }
        }
        if(res.equals("-0")){
          System.out.println("0");
        }
        else {
          System.out.println(res);
        }
      }
    }
  }
}