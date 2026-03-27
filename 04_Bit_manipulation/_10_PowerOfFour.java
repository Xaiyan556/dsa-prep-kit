public class _10_PowerOfFour {

    public static boolean isPowerOfFour(int n) {
        return (n > 0) &&
               ((n & (n - 1)) == 0) &&
               ((n & 0x55555555) != 0);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16)); // true
        System.out.println(isPowerOfFour(8));  // false
        System.out.println(isPowerOfFour(4));  // true
    }
}