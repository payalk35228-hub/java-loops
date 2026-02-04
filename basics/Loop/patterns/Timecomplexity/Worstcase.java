package Loop.patterns.Timecomplexity;
import java.util.Scanner;
public class Worstcase {
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                System.out.println("hello world :");
            }
        }
    }
    
}
//n*n=n^2
//worst case is 0(n) time complexity