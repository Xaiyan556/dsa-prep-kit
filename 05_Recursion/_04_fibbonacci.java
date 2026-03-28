class Main {

    static int fib(int n) {
        if (n == 0) return 0;   // base case
        if (n == 1) return 1;   // base case

        return fib(n - 1) + fib(n - 2);  // recursive case
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
}