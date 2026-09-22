import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the input");
    int[][] outer=new int[4][4];
    int count=0;
    for(int i=0;i<4;i++){
      for(int j=0;j<4;j++) {
        System.out.println("Enter array item");
        int n= scanner.nextInt();
        outer[i][j]=n;
      }
    }
    for(int i=0;i<4;i++){
        if(outer[i][3]==1){
          if(outer[i][0]+outer[i][1]+outer[i][2]==0){
            if(i==0){
              if(outer[1][0]+outer[2][1]+outer[3][2]==0){
                count=0;
              }
              else{
                System.out.println("YES");
                count+=1;
                break;
              }
            }
            else if(i==1){
              if(outer[2][0]+outer[3][1]+outer[0][2]==0){
                count=0;
              }
              else{
                System.out.println("YES");
                count+=1;
                break;
              }
            }
            else if(i==2){
              if(outer[3][0]+outer[0][1]+outer[1][2]==0){
                count=0;
              }
              else{
                System.out.println("YES");
                count+=1;
                break;
              }
            }
            else if(i==3){
              if(outer[0][0]+outer[1][1]+outer[2][2]==0){
                count=0;
              }
              else{
                System.out.println("YES");
                count+=1;
                break;
              }
            }
          }
          else{
            System.out.println("YES");
            count+=1;
            break;
          }
        }

    }
    if(count==0){
      System.out.println("NO");
    }
  }
}