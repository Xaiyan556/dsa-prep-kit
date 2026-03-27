public class _08_ClearLastIBits {

    public static int clearLastIBits(int n, int i) {
        return n & (~0 << i);
    }

    public static void main(String[] args) {
        int n = 15; // 1111
        int i = 2;

        System.out.println(clearLastIBits(n, i)); // 1100 → 12
    }
}