public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            // First inner loop: Prints spaces to push the stars to the center
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Second inner loop: Prints the actual stars (odd numbers: 1, 3, 5...)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}