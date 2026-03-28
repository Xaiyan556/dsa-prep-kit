class Main {

    static void printDec(int n) {
        if (n == 0) return;   // base case

        System.out.println(n);  // print first
        printDec(n - 1);        // recursive call
    }

    public static void main(String[] args) {
        printDec(5);
    }
}