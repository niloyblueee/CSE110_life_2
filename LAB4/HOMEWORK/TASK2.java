import java.util.Scanner;
public class TASK2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        int sum = 0 ;
        for(int i = 0 ; i < 10 ;i++){
            System.out.print("Enter Number: ");
            int x = inp.nextInt() ;
            sum += x ;
            System.out.println("Sum = "+sum);
        }
    }
}
