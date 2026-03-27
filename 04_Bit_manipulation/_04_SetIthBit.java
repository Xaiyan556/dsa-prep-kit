public class _04_SetIthBit {

    public static int setIthBit(int n, int i) {
        return n | (1 << i);
    }

    public static void main(String[] args) {
        int n = 5; // 101
        int i = 1;

        System.out.println(setIthBit(n, i)); // 7
    }
}