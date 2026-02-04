package Loop.patterns;
import java.util.Scanner;
public class Hallowrectangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of rows :");
        int rows = sc.nextInt();
        System.out.println("enter number of columns :");
        int cols = sc.nextInt();
        for(int i=1;i<=rows;i++){  //outer loop(kitni line print hogi)
            for(int j=1;j<=cols;j++){ ////inner loop(kya print karni hai)
                if(i==1||i==rows||j==1||j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
