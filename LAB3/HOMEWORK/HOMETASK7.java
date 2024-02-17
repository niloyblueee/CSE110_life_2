import java.util.Scanner;
public class HOMETASK7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("Enter the amount the customer need to pay (Taka)");
        int needtopay = inp.nextInt();
        System.out.println("Enter the amount, customer gave(Taka)");
        int paid = inp.nextInt();
        if (needtopay<paid){
            int returnamount = paid - needtopay ;
            System.out.println("The returned amount is "+returnamount+ " taka " );
            //note calculation
            int hundred=Math.floorDiv(returnamount,100);
            if (hundred!=0){
                System.out.println("100 taka note: "+ hundred);
                returnamount = returnamount-100*hundred;
            }
            else{
                System.out.println("100 taka note: "+ hundred);
            }
            int fifty = Math.floorDiv(returnamount,50);
            if (fifty!=0){
                System.out.println("50 taka note: "+ fifty);
                returnamount = returnamount-50*fifty;
            }
            else{
                System.out.println("50 taka note: "+ fifty);
            }    
            int twenty =  Math.floorDiv(returnamount,20);
            if (twenty!=0){
                System.out.println("20 taka note: "+ twenty);
                returnamount = returnamount-20*twenty;
            }
            else{
                System.out.println("20 taka note: "+ twenty);
            }    
            int ten=  Math.floorDiv(returnamount,10);
            if (ten!=0){
                System.out.println("10 taka note: "+ ten);
                returnamount = returnamount-10*ten;  
            }
            else{
                System.out.println("10 taka note: "+ ten);
            }        
            int five =  Math.floorDiv(returnamount,5);
            if (five!=0){
                System.out.println("5 taka note: "+ five);
                returnamount = returnamount-5*five;
            }
            else{
                System.out.println("5 taka coin: "+ five);
            }
            int two =  Math.floorDiv(returnamount,2);
            if (two!=0){
                System.out.println("2 taka coin: "+ two);
                returnamount = returnamount-2*two;
            }
            else{
                System.out.println("2 taka coin: "+ two);
            }
            int one =  Math.floorDiv(returnamount,1);
            if (one!=0){
                System.out.println("1 taka coin: "+ one);
                returnamount = returnamount-1*one;
            }
            else{
                System.out.println("1 taka coin: "+ one);
            }








        }

        else if (needtopay == paid ){
            System.out.println(" The returned amount is 0 taka " );
        }
        else{
            System.out.println("Please pay "+ (needtopay-paid) + " taka more."  );
        }    
    }
}
