package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.printf("Reduce: " + reduce(100));
    }

    static int reduce(int n) {
        // returns the number of steps to reduce an int n to zero by following this pattern:
        // if even, divide by 2
        // if odd, subtract 1
        // precondition: n >= 0
        if (n == 0) {
            return 0;
        }
        else if (n % 2 == 0) {
            return 1 + reduce(n / 2);
        }
        else {
            return 1 + reduce(n - 1);
        }
    }
}

