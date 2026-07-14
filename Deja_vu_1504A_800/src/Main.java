import java.util.Scanner;

public class Main {
  public static boolean isPalindrome(String word){
    if(new StringBuilder(word).reverse().toString().equals(word)){
      return true;
    }
    else{
      return false;
    }
  }
  static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of cases");
    int t = scanner.nextInt();
    for (int j = 0; j < t; j++) {
      System.out.println("Enter the word");
      String word = scanner.nextLine();

      boolean flag = false;
      for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) != 'a') {
          flag = true;
        }

        if (flag) {
          boolean check = true;
          System.out.println("YES");
          if (!isPalindrome("a" + word)) {
            System.out.println("a" + word);
            check = false;
          } else if (!isPalindrome(word + "a")) {
            System.out.println(word + "a");
            check = false;
          }
          while (check) {
            int index = 1;
            if (!isPalindrome(word.substring(0, index) + "a" + word.substring(index))) {
              System.out.println(word.substring(0, index) + "a" + word.substring(index));
              check = false;
            }
            index += 1;
          }
        }


      }
    }
  }}
