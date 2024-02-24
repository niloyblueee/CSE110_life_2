import java.util.Scanner;
public class TASK2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int x = inp.nextInt();
        int neg = 0;
        int pos = 0 ;
        for (int idx=0; idx<x;idx++){
            System.out.print("Enter number "+(idx+1)+":");
            int j = inp.nextInt();
            if(j<0){
                neg++;
            }
            else{
                pos++;
            }

        }
        System.out.println(pos + " Non-negative Numbers");
        System.out.println(neg + " Negative Numbers");
            
    
    
    }
    
}
