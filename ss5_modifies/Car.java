package ss5_modifies;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars; // Biến tĩnh dùng để đếm số lượng xe

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    // getters and setters
}