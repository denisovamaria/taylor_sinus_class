public class Sinus_taylor {
    public double getSinus(double x, double eps) {
        double newx = x;
        int n = 0;
        double sum = 0;
        if (x == 0)
        {
            throw new NullPointerException("x cannot be null");
        }
        while (x > 2 * Math.PI) {
            x = x - 2 * Math.PI;
        }
        while (x < 0) {
            x = x + 2 * Math.PI;
        }
        double sinus = x;
        while (Math.abs(sinus) > eps) {
            sum = sum + sinus;
            n++;
            sinus = sinus * (-1 * x * x) / (2 * n) / (2 * n + 1);
        }
        sum = sum + sinus;
        return sum / newx;
    }
}
