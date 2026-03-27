public class _05_ClearIthBit {

    public static int clearIthBit(int n, int i) {
        return n & ~(1 << i);
    }

    public static void main(String[] args) {
        int n = 5; // 101
        int i = 2;

        System.out.println(clearIthBit(n, i)); // 1
    }
}