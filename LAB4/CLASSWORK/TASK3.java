import java.util.Scanner;
import java.lang.Math;
public class TASK3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        for(int i=1; i>0;i++){
            System.out.print("Enter Number: ");
            double N = inp.nextDouble();
            if(N<0){
                break;
            }
            else{
            double calc = Math.pow(N,2);
            System.out.println((int)N+" ^ 2 = "+(int)calc);
            }
        }        
    }
}
