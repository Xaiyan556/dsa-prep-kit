public class Main {
    public static long fastPower(long a, int n) {
        long ans = 1;

        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * a;
            }

            a = a * a;
            n = n >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastPower(3, 5)); // 243
    }
}