import java.util.Scanner;

class Forloop{
    public static void main(String args[]){
        int up_bound = 0, sum = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter up bound: ");
        up_bound = input.nextInt();
        
        for(int i = 1; i <= up_bound; i++){
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
