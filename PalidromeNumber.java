class Main {
    public static void main(String[] args) {
        System.out.println(palidromeNumber(121));
    }
    
    public static boolean palidromeNumber(int number){
        
        int originalNumber = number;
        int reversed = 0;
        
        while (number > 0){
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        return reversed == originalNumber;
        
    }
}
