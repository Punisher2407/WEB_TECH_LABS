package by.bsuir.classes_and_objects.ninth_task;

public class Ball {
    private String color;
    private double weight;

    public double getWeight() {
        return this.weight;
    }

    public String getColor() {
        return this.color;
    }

    public Ball(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
