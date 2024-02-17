import java.util.Scanner; 
import java.lang.Math;
public class HOMETASK3 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.println("ENter an= number : ");
        int x = inp.nextInt();
        double ans=0;
        if (x<0){
            ans = 2*x;
        }
        else if (x==0 || x<2 ){
            ans = x+1;
        }
        else if (x==2 || x<5){
            ans = Math.pow(x,2)-1;
        }
        else if (x==5 || x>5){
            ans = 3*Math.pow(x,2) + 2 ;
        }
        System.out.println("output: "+ (int)ans );       
    }   
}
