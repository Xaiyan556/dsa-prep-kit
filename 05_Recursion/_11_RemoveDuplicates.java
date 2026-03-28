public class RemoveDuplicates {

    public static void solve(String str, int idx, boolean[] seen, String ans) {
        // Base case
        if (idx == str.length()) {
            System.out.println(ans);
            return;
        }

        char curr = str.charAt(idx);
		// curr - 'a' represent index of that boollean array
        if (seen[curr - 'a']) {
            // Skip duplicate
            solve(str, idx + 1, seen, ans);
        } else {
            // Take character
            seen[curr - 'a'] = true;//boolean array of alphabt a to z
            solve(str, idx + 1, seen, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        solve(str, 0, new boolean[26], "");
    }
}