import java.util.Scanner;
public class TASK1 {
    public static void main(String[]args){
        int highest = 0;
        Scanner inputter= new Scanner(System.in);
        System.out.println("enter something");
        int x = inputter.nextInt();        
        System.out.println("enter something");
        int y = inputter.nextInt();        
        System.out.println("enter something");
        int z = inputter.nextInt();
        if (x>y){
            highest=x;
        } 
        else{
            highest=y;
        }
        if (highest<z){
            highest=z;
        }
        else {
            highest=highest;
        }
        System.out.println("largest number:"+highest);
    }

}