import java.util.Scanner;

public class CashRegister{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter total: ");
        int total = input.nextInt();
        
        System.out.print("Your payment: ");
        int payment = input.nextInt();
        
        if(payment < total){
            System.out.println("You do not have enough money.");
        }
        else{
            int change = payment - total;
            System.out.println("Your change is "+ change + ". Here is your change: ");
            
            int[] bills = {1000, 500, 200, 100, 50,20,5,1};
            String[] names = {"1000-peso bill","500-peso bill","200-peso bill","100-peso bill","50-peso bill","20-peso bill","5-peso coin","1-peso coin"};
            
            for(int i = 0; i < bills.length; i++){
                int count = change / bills[i];
                if(count > 0){
                    System.out.println(count + " " + names[i]);
                    change = change % bills[i];
                }
            }
        }
        input.close();
    }
}
