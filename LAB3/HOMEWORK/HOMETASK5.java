import java.util.Scanner;
public class HOMETASK5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter salary");
        int salary = inp.nextInt() ;
        System.out.println("Enter age");
        int age = inp.nextInt();
        double tax;
        if (salary<10000 && age>=18){
            System.out.println("Your tax amounts in 0 Tk");
        }
        else if (salary>=10000 && salary<=20000 && age>=18){
            tax = .05*salary;
            System.out.println("Your tax amounts in "+ (int)tax +" Tk");
        }
        else if (salary<20000 && age>=18){
            tax = .1*salary;
            System.out.println("Your tax amounts in "+ (int)tax +" Tk");
        }    
        else {
            System.out.println("Your tax amounts in 0 Tk");
        }
    
    
    }
}
