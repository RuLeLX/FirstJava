package Equation;
public class Square {
    public static double[] Solution(double a, double b, double c) {
        double D = b * b - 4 * a * c;

        if (D > 0) {
            double x0, x1;
            x0 = (-b + Math.sqrt(D)) / (2 * a);
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            double[] sol = {x0, x1};

            return sol;
        } else if (D == 0) {
            double x0;
            x0 = (-b + Math.sqrt(D)) / (2 * a);
            double[] sol = {x0};
            return sol;
        } else {
            double[] sol = {};
            return sol;
        }
    }
}
