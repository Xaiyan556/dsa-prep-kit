public class _06_UpdateIthBit {

    public static int updateIthBit(int n, int i, int newBit) {
        // Step 1: clear i-th bit
        n = n & ~(1 << i);

        // Step 2: set new bit(maybe 0 or maybe 1)
        return n | (newBit << i);
    }

    public static void main(String[] args) {
        int n = 5; // 101

        System.out.println(updateIthBit(n, 1, 1)); // 111 → 7
        System.out.println(updateIthBit(n, 2, 0)); // 001 → 1
    }
}