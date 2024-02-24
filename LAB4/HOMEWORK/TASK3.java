import java.util.Scanner;
public class TASK3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("Enter the tester: ");
        int x = inp.nextInt();
        for (int idx = 0; idx <=x ;idx++  ) { 
            if (idx%5==0 && idx%3!=0){
                System.out.println(idx);
            }
        }
    }
}
