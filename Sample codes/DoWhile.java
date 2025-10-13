import java.util.Scanner;

class DoWhile{
    public static void main(String args[]){
        int up_bound = 0, sum = 0;
        Scanner input = new Scanner(System.in);
        
       do{
           System.out.print("Enter number: ");
           up_bound = input.nextInt();
       }
       
       while(up_bound < 1);
       
           for(int i = 1; i <= up_bound; i++){
               sum += i;
           }
       System.out.println("Sum: " + sum);
    }
}
