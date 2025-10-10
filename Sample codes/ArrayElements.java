class Main{
    public static void main(String[] args){
        int sum = 0;
        int[][] nums = new int[3][3];
        
        System.out.println("Length of rows: " + nums.length);
        
        if(nums.length > 0) {
            System.out.println("Length of columns: " + nums[0].length);
        }else{
            System.out.println("Array is empty and no columns.");
        }
        
        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums[row].length; col++){
                nums[row][col] = (row + 3) * (col + 2);
            }
        }
        
        for(int[] rvals : nums){
            for(int cvals : rvals){
                System.out.println(cvals + " ");
                sum += cvals;
            }
            System.out.println();
        }
        
        System.out.println("Summation: " + sum);
    }
}
