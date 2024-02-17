import java.util.Scanner; 
public class HOMETASK2 {
    public static void main(String[] args) {
        Scanner importer = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = importer.nextInt();
        if (x%5==0 && x%7==0){
            System.out.println("Divisible by Both");
        }
        else if (x%5==0 && x%7!=0){
            System.out.println("Invalid: Divisible by 5");            
        }
        
        else if (x%5!=0 && x%7==0){
            System.out.println("Invalid: Divisible by 7");            
        }
        else{            
            System.out.println("NO");                    
        }
    }
}
