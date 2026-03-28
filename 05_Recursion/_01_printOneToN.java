class Main {

    static void printInc(int n) {
        if (n == 0) return;   // base case

        printInc(n - 1);      // recursive call first
        System.out.println(n); // print after returning of call stack or stack down
    }

    public static void main(String[] args) {
        printInc(5);
    }
}