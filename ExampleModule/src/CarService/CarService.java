package CarService;

import java.util.Scanner;

public class CarService {
    public static void Serv(Car ClientCar) {
        System.out.println("Для машины доступны операции: 1.Помытъ\n, 2.Починить\n, 3.Продать\n");
        Scanner console = new Scanner(System.in);
        int option = console.nextInt();

        switch (option) {
            case 1:
                ClientCar.Clear();
                System.out.println("Помыли");
                break;
            case 2:
                ClientCar.Fix();
                System.out.println("Починили");
                break;
            case 3:
                ClientCar.Sale();
                System.out.println("Продали");
                break;
        }

    }
}
