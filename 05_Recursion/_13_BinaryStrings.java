public class _13_BinaryStrings {

    public static void generate(int n, int last, StringBuilder sb) {
        // Base case
        if (n == 0) {
            System.out.println(sb.toString());
            return;
        }

        // Place '0'
        sb.append('0');
        generate(n - 1, 0, sb);
        sb.deleteCharAt(sb.length() - 1); // backtrack

        // Place '1' (only if last != 1)
        if (last == 0) {
            sb.append('1');
            generate(n - 1, 1, sb);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generate(n, 0, new StringBuilder());
    }
}