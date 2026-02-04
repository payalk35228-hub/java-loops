package Loop.patterns;
import java.util.Scanner;
public class Squarepattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size if sqaure :");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){  //outer loop(mtlb kis line pe ho)
            for(int j=1;j<=n;j++){  //inner loop(mtlb ky print karna hai)
                System.out.print(j+" ");
               


            }
            System.out.println();
        }
    }

    
}




