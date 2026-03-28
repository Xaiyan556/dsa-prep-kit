class _03_factorial {

    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;  // base case

        return n * factorial(n - 1);     // recursive case
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}