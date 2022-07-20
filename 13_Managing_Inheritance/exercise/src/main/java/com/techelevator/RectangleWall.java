package com.techelevator;

public class RectangleWall extends Wall{


     private int length;
     private int width;

     public RectangleWall(String name, String color, int length, int width){
          super(name, color);
         this.length = length;
         this.width= width;
     }
     public int getArea(){
          return length * width;
     }

     @Override
     public String toString() {
          return "RectangleWall{" +
                  "length=" + length +
                  ", width=" + width +
                  '}';
     }
}
