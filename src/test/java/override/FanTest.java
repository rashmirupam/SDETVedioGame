package override;

import java.util.Objects;

public class FanTest {
    public static void main(String[] args) {
  Fan f= new Fan("red","usha",3);
        Fan f1= new Fan("red","usha",3);
        System.out.println(f==f1);
        System.out.println(f.equals(f1));
    }
}
class Fan{
    String color;
    String brand;
    int wings;

    public Fan(String color, String brand, int wings) {
        this.color = color;
        this.brand = brand;
        this.wings = wings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fan fan = (Fan) o;
        return wings == fan.wings && Objects.equals(color, fan.color) && Objects.equals(brand, fan.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, brand, wings);
    }
}
