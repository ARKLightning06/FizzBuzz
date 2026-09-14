package lab1;

public class Multiples {
    public static void main(String[] args) {
        // This method returns the number of multiples of three or five under 1000
        int n = 6700;
        int a = 42;
        int b = 13;
        System.out.printf("There are " + multiples(n, a, b) +
                " multiples of " + a + " or " + b + " between 1 and " + n + ".");
    }

    static int multiples(int n, int a, int b) {
        int multipleCount = 0;
        for (int i = 1; i < n; i++)
        {
            if (isMultipleOfAOrB(i, a, b)) {
                multipleCount += 1;
            }
        }
        return multipleCount;
    }

    static int multiples() {
        return multiples(1000, 3, 5);
    }

    private static boolean isMultipleOfAOrB(int n, int a, int b) {
        return n % a == 0 || n % b == 0;
    }
}
