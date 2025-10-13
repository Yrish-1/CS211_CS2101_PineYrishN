import java.util.Scanner;

class PyramidLoop{
    public static void main(String args[]){
        int rows = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Number of rows: ");
        rows = input.nextInt();
        
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
             System.out.println();
        }
    }
}
