public class InvertedTriangle {
    public static void main(String[] args) {
        int rows = 5;
        
        // Outer loop starts at max rows and decreases
        for (int i = rows; i >= 1; i--) {
            // Inner loop prints stars up to the current value of i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}