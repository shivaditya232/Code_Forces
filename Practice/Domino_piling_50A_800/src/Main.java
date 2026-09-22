import java.util.Scanner;
class Main{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the breadth");
        int b=scanner.nextInt();
        System.out.println("Enter the length");
        int l=scanner.nextInt();
        int length=l;
        int breadth=b;
        int countb=0;
        int countl=0;
        int counth=0;
        while(b>0){
            b-=1;

            countb+=1;
        }
        l-=2;
        countl+=1;
        while(l>0){
            if(Math.floorDiv(l,2)==0){
                while(counth+2<=breadth){
                    counth+=1;
                    breadth-=2;
                }
            }
            else {
                countl += 1;
                l -= 2;
            }
        }
        int result=countl*countb+counth;
    }
}