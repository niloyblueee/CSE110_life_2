import java.util.Scanner;
import java.lang.Math;
public class TASK5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("ENTER THE TESTER: ");
        int  x = inp.nextInt();
        int main = x ;
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
        double divisor = Math.pow(10, count-1) ;
        
        while ( main == main  ){
            if (main % divisor!=0){
                System.out.print(Math.floorDiv(main, (int) divisor)+",");
                main = main % (int) divisor;
                if (count>0){
                    count-=1;
                }
                divisor = Math.pow(10, count-1) ;                                
            }
            else{
                System.out.print(Math.floorDiv(main, (int) divisor));
                break;
            }        
        }
    }
}
