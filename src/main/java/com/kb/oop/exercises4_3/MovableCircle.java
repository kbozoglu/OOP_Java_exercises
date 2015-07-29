package com.kb.oop.exercises4_3;

/**
 * Created by kbozoglu on 26.07.2015.
 */
public class MovableCircle implements Movable{

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }
}
