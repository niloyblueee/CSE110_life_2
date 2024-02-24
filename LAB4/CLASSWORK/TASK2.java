import java.util.Scanner;
public class TASK2 {
    public static void main (String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("N= ");
        int N= inp.nextInt();
        int sum=0;
        double avg=0;
        System.out.println("Input the "+N+" numbers:");
        for (int i=0;i<N;i++){        
            int x = inp.nextInt();
            sum+=x;  
        }
        avg = sum/N;
        System.out.println("The sum of "+N+" no is:"+ sum);
        System.out.println("The Average is: "+avg);
    }
}
