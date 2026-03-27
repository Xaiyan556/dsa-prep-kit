public class _11_PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false; // important edge case
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));  // true
        System.out.println(isPowerOfTwo(7));  // false
        System.out.println(isPowerOfTwo(16)); // true
    }
}