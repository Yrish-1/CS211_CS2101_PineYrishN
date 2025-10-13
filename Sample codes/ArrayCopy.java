class ArrayCopyMethod{
    public static void main(String[] args) {
        String[] source = {"Coups", "Jeonghan", 
                          "Dino", "Wonwoo",
                          "Joshua", "Jun", 
                          "Hoshi", "Woozi",
                          "Mingyu", "DK",
                          "Minghao", "Seungkwan", "Vernon"
                        };
        String[] destination = new String[8];
        System.arraycopy(source, 5, destination, 0, 5);

        boolean isFirst = true;
        for(String character : destination){
            if(!isFirst){
                System.out.print(", ");
            }
            System.out.print(character);
            isFirst = false;
        }
    }
}
