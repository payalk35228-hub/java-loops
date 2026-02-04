package Loop.patterns;
import java.util.Scanner;
public class Pyramid180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a n :");
        int n = sc.nextInt();
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop -> space print
            for(int j=1;j<=n;j++){
                System.out.print(" ");
            }

            //inner loop -> star print
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();

        }
 

    
    }
    
}
