package ru.job4j.oop;

public class Fox {
    public void tryEat(Ball ball) {
        System.out.println("Лиса пытается съесть Колобка.");
        ball.tryRun(true);
    }
}