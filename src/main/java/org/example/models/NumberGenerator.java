package org.example.models;

import org.example.controllers.GuessMyNumberController;

import java.util.Random;

public class NumberGenerator {

    private int numberToGuess;

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public void setNumberToGuess(int maxLimit) {
        Random random = new Random();
        this.numberToGuess = random.nextInt(maxLimit);
    }


}
