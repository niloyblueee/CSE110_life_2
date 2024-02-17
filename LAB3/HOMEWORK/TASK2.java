import java.util.Scanner;

public class TASK2 {
    public static void main(String[]args){
        String grade="";
        Scanner inputter = new Scanner(System.in);
        System.out.println("ENTER THE MARKS:");
        int x = inputter.nextInt();
        if (90<=x){
            grade="A";    
        }
        else if (85<=x && 89>=x){
            grade="A-";    
        }
        else if (70<=x && 84>=x){
            grade="B";    
        }
        else if (57<=x && 69>=x){
            grade="C";    
        }
        else if (50<=x && 56>=x){
            grade="D";    
        }
        else if (50<x){
            grade="F";    
        }

        System.out.println( "Your grade is" +" "+ grade );

    }
}
