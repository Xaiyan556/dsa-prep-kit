public class _03_GetIthBit {

    public static int getIthBit(int n, int i) {
        return (n & (1 << i)) == 0 ? 0 : 1;
    }

    public static void main(String[] args) {
        int n = 10; // 1010
        int i = 1;

        System.out.println(getIthBit(n, i)); // 1
    }
}