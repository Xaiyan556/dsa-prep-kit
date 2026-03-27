public class ToggleIthBit {

    public static int toggleIthBit(int n, int i) {
        return n ^ (1 << i);
    }

    public static void main(String[] args) {
        int n = 5; // 101

        System.out.println(toggleIthBit(n, 1)); // 111 → 7
        System.out.println(toggleIthBit(n, 2)); // 001 → 1
    }
}