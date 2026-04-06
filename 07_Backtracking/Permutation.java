public class Permutation {

    static void findPermutations(String str, String ans) {

        // 🎯 base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // 🔁 loop through all choices
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            // ✂️ remove current character
            String newStr = str.substring(0, i) + str.substring(i + 1);
//in 1st part i excluded
// in 2nd part substring start from i+1 th element till end
            // ⬇️ recurse with remaining string
            findPermutations(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        findPermutations("abc", "");
    }
}
