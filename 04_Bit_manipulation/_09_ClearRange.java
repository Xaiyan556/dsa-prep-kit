public class _09_ClearRange {

    public static int clearBitsInRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int mask = a | b;

        return n & mask;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt("100111010011", 2);
        int result = clearBitsInRange(n, 2, 7);

        System.out.println(Integer.toBinaryString(result));
        // Output: 100100000011
    }
}