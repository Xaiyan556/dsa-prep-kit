public class _02_OddEven {

    public static void checkOddEven(int n) {
        if ((n & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

    public static void main(String[] args) {
        checkOddEven(5); // Odd
        checkOddEven(8); // Even
    }
}