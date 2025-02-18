package ClassAndObject;

public class Fan {
    // Các hằng số cho tốc độ
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        if (on){
            return "Fan is on. Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is off. Color: " + color + ", Radius: " + radius;
        }
    }
}

/*
            +-----------------------------------------+
            |                Fan                     |
            +-----------------------------------------+
            | - speed: int                           |
            | - on: boolean                          |
            | - radius: double                       |
            | - color: String                        |
            +-----------------------------------------+
            | + SLOW: final int = 1                  |
            | + MEDIUM: final int = 2                |
            | + FAST: final int = 3                  |
            | + Fan()                                |
            | + getSpeed(): int                      |
            | + setSpeed(speed: int): void           |
            | + isOn(): boolean                      |
            | + setOn(on: boolean): void             |
            | + getRadius(): double                  |
            | + setRadius(radius: double): void      |
            | + getColor(): String                   |
            | + setColor(color: String): void        |
            | + toString(): String                   |
            +-----------------------------------------+

 */