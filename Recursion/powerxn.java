public class powerxn {

    public static double myPow(double x, int n) {

        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }

    public static double power(double x, long n) {

        if (n == 0) return 1;

        double nm = power(x, n / 2);

        if (n % 2 == 0) {
            return nm * nm;
        } else {
            return x * nm * nm;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.000, -10));
    }
}