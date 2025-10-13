public class FibonnacciRecursive{
    public static int fibonacci(int n) {
        if(n <= 1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n - 2);
        }
    }
    
    public static void main(String args[]){
        int position = 6;
        System.out.println("Position: " + position);
        System.out.println("Fibonacci number: " + fibonacci(position));
    }
}
