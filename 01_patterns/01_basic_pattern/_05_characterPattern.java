public class _05_characterPattern {

    public static void main(String[] args) {

        int n = 4;
        char ch = 'A';

        for(int i = 1; i <= n; i++) {     // rows
            
            for(int j = 1; j <= i; j++) { // characters
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}