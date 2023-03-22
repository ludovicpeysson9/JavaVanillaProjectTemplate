package org.example;

import org.example.controllers.GuessMyNumberController;

public class Main {
    public static void main(String[] args) {

        GuessMyNumberController game = new GuessMyNumberController();
        game.start();
    }
}