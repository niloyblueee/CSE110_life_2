import java.util.Scanner;
import java.lang.Math;
public class TASK1 {
    public static void main (String[]args){
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int d=1;
        System.out.println("Divisors of "+x+":");   
        while (d!=x+1){                     
            if(x%d==0){ 
            System.out.println(d);         
            }
            d++;
        }










    }
}
