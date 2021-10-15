package lessons.lesson15102021.optional;

public class Oil {

    private String brand;

    public Oil() {
    }

    public Oil(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Oil{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
