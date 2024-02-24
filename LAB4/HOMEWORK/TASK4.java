import java.util.Scanner;
import java.lang.Math;
public class TASK4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("ENTER THE TESTER: ");
        int  x = inp.nextInt();
        int count = 0 ;
        while (x==x) {
            int temp = Math.floorDiv(x, 10);
            x = temp ;
            if (temp ==0){
                count++;
                break;
            }
            else{
                count++;
            }
        }
        System.out.println("Total digits = "+ count);
    }
}
