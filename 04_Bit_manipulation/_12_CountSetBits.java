public class Main {
    public static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countSetBits(n)); // Output: 2
    }
}