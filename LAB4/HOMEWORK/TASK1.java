import java.util.Scanner;
public class TASK1 {
    public static void main (String [] args ){
        Scanner inp = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int x= inp.nextInt();
        System.out.println("The odd numbers are: ");
        int i =1;
        int idx = 0;
        int sum = 0;
        while( idx < x){
            System.err.println(i);
            sum+=i;
            i+=2;
            idx++;
        }
        System.out.println("The Sum of odd Natural Numbers up to 5 terms is: "+ sum);
    } 
}
