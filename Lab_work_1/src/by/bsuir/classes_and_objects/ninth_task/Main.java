package by.bsuir.classes_and_objects.ninth_task;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(5.15, "white"));
        basket.addBall(new Ball(2.28, "blue"));
        basket.addBall(new Ball(4.1, "black"));
        basket.addBall(new Ball(1.3, "blue"));
        System.out.println(basket.calculateBallsWeight());
        System.out.println(basket.getBlueBallsCount());
    }
}
