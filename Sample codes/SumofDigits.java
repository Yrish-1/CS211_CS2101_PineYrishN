public class Main{
    
    public static int sumOfDigits(int n){
        if(n == 0)
            return 0;
            
        return n % 10 + sumOfDigits (n / 10);
    }

    public static void main(String[] args){
        int num = 1234;
        System.out.println("Sum of digits of " + num + " is " + sumOfDigits(num));
    }
}

//sumOfDigits(0) returns 0
//sumOfDigits(1) returns 1 + 0 = 1
//sumOfDigits(12) returns 2 + 1 = 3
//sumOfDigits(123) returns 3 + 3 = 6
//sumOfDigits(1234) returns 4 + 6 = 10
