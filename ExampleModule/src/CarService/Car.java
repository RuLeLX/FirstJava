package CarService;

import java.util.HashMap;

public class Car {
    private String mark;
    private double year_born;
    private int count_owner;

    public Car(String mark, double year_born, int count_owner) {
        this.mark = mark;
        this.year_born = year_born;
        this.count_owner = count_owner;
    }

    public void Fix() {}

    public void Clear() {}

    public void Sale() {
        count_owner++;
    }

}
