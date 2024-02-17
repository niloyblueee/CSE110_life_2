import java.util.Scanner;

public class HOMETASK1 {
    public static void main(String[] args) {
        char sign ;
        int x , y ;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        
        sign = input.next().charAt(0);
        if (sign== '+'){
            System.out.println(x+y);
        }
        else if (sign == '-'){
            System.out.println(x-y);
        }    
        else if (sign == '*'){
            System.out.println(x*y);
        }
        else if (sign == '/'){
            System.out.println(x/y);
        }

    }
}
