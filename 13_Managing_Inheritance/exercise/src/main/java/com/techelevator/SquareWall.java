package com.techelevator;

public class SquareWall extends RectangleWall{

    private int sideLength;

    public SquareWall(String name, String color, int sideLength){
        super(name, color, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public int getArea(){
        return sideLength * sideLength;
    }

    public String toString() {
        return String.format("%s (%dx%d) square", getName(), getLength(), getHeight());
    }
}
