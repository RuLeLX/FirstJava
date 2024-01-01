import java.io.IOException;
import java.util.Scanner;

import Equation.Square;

public class Main {
    public static void main(String[] args) throws IOException{
        double a, b, c; //Parameters
        Scanner console = new Scanner(System.in);
        System.out.println("Введите коэффициенты уравнения: ");

        a = console.nextDouble();
        b = console.nextDouble();
        c = console.nextDouble();

        double[] solution = Square.Solution(a, b, c);
        for (double x: solution) {
            System.out.println("Решение уравнения: " + x);
        }

    }
}