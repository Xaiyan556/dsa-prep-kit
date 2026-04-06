public class Subsets {

    static void findSubsets(String str, String ans, int i) {
	//i->index
	// i also decide level of recusion- backtracking tree
        // 🎯 base case: processed all characters
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // 🟢 include current character(yes)
        // 1st possiblity
        findSubsets(str, ans + str.charAt(i), i + 1);

        // 🔴 exclude current character(no)
        // 2nd possiblity
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
        // empty"" string pass as default anser
    }
}