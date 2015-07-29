package com.kb.oop.exercises4_3;

/**
 * Created by kbozoglu on 26.07.2015.
 */
public class MovableRectangle implements Movable {
    public MovablePoint topLeft;
    public MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }


    @Override
    public void moveUp() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= topLeft.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += topLeft.ySpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += topLeft.xSpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= topLeft.xSpeed;
    }
}
