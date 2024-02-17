import java.util.Scanner;

public class HOMETASK4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter id");
        String x = inp.nextLine();
        String year = x.substring(0,2);
        String  sem = x.substring(2,3);
        int y = Integer.parseInt(sem) ;
        if (y==1){
            System.out.println("Student Joined BRAC in " + "Spring" +  Integer.parseInt(year) );
        }
        else if (y==2){
            System.out.println("Student Joined BRAC in " + "Fall" +  Integer.parseInt(year) );
        }
        else if (y==3){
            System.out.println("Student Joined BRAC in " + "Summer" +  Integer.parseInt(year) );
        }    
    }
}
