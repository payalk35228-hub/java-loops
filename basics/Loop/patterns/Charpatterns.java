package Loop.patterns;
import java.util.Scanner;
public class Charpatterns {
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        //take input
        System.out.println("enter no of rows :");
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                char ch = (char)('A'+j);
                System.out.print(ch+" ");
                
            }
            System.out.println();

        }

        
    }
    
}
