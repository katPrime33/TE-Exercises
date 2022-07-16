package com.techelevator;

public class FruitTree {

    //member vars

    private String typeOfFruit;
    private int piecesOfFruitLeft;


    //constructor

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;

    }

    //methods

    public boolean pickFruit(int numberOfPiecesToRemove){
        //is there enough fruit to pick given number
        if(getPiecesOfFruitLeft() - numberOfPiecesToRemove >= 0){
            piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
        }
        return false;
    }


    //write getters for member vars
    public String getTypeOfFruit(){
        return this.typeOfFruit;
    }

    public int getPiecesOfFruitLeft(){
        return this.piecesOfFruitLeft;
    }

}
