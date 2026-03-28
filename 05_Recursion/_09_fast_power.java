public class _09_fast_power {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(fastPower(x, n));  // Output: 1024
    }
static int fastPower(int x, int n) {
    if (n == 0) return 1;

    int half = fastPower(x, n / 2);

    if (n % 2 == 0) {
        return half * half;
    } else {
        return x * half * half;
    }
}
}