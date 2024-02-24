import java.util.Scanner;
public class TASK6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("ENTER THE TESTER: ");
        int  x = inp.nextInt();
        //prime test
        int priCount=0;
        for (int i=1; i <=x ; i++ ){
            if(x%i==0){
                priCount+=1;
            }
        }
        if (priCount==2){
            System.out.println(x+ " is a prime number");
        }
        else{
            System.out.println(x+ " is not a prime number");
        }
        int persum=0;
        for(int i=1;i<x;i++){
            if(x%i==0){
                persum+=i;
            }
        }
        if (persum==x){
            System.out.println(x+ " is a perfect number");
        }
        else{
            System.out.println(x+ " is not a perfect number");
        }
    }
}
