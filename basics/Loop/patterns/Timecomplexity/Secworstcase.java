package Loop.patterns.Timecomplexity;
import java.util.Scanner;
public class Secworstcase {
    public static void main(String[]argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a n");
        int n= sc.nextInt();
        System.out.println("enter a m");
         int m = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("hello world");
            }
        }
    }
    
}

// outer loops n times run kar raha hai
//iiner loops n times operations kar raha hai 

//it means [n times*m times]
//n*m
//time complexity is 0(n*m )
