package org.example.controllers;

import org.example.views.DisplayView;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumberController {

    Scanner scanner;
    DisplayView display = new DisplayView();

    private int maxLimit = -1;
    private int chancesToGuess;
    private int numberToGuess;
    private int tentative = -1;

    public GuessMyNumberController() {
        this.scanner = new Scanner(System.in);
    }

    public void setWhichRange() {
        while (maxLimit < 0 || maxLimit > 300) {
            display.chooseRangeMessage();
            if (scanner.hasNextInt()) {
                this.maxLimit = scanner.nextInt();
            } else {
                display.errorInteger();
                scanner.next();
            }
            if (maxLimit != -1 && (maxLimit < 0 || maxLimit > 300)) {
                display.errorOutOfBounds();
            }
        }
    }

    public void setNumberToGuess(int maxLimit){
        Random random = new Random();
        numberToGuess = random.nextInt(maxLimit);
    }

    public void setChancesToGuess() {
        if (maxLimit > 0 && maxLimit < 50){
            this.chancesToGuess = 4;
        }
        if (maxLimit >= 50) {
            this.chancesToGuess = 5;
        }
        if (maxLimit >= 100 && maxLimit <= 200) {
            this.chancesToGuess = 6;
        }
        if (maxLimit >= 201 && maxLimit <= 300) {
            this.chancesToGuess = 7;
        }
    }

    public String hint(){
        String hint = "";

        if(tentative > numberToGuess){
            hint = "Trop grand!";
        }else{
            hint = "Tu es petit!";
        }
        if(tentative == numberToGuess){
            hint = "";
        }
        return hint;
    }

    public void start() {
        setWhichRange();
        setChancesToGuess();
        display.howManyChances(chancesToGuess);
        setNumberToGuess(maxLimit);
        display.display(String.valueOf(numberToGuess));
        runOfTheGame();
    }

    public void runOfTheGame() {
        while (tentative != numberToGuess && chancesToGuess > 0) {
            display.display("Il vous reste : " + chancesToGuess + " tentatives");
            if (scanner.hasNextInt()) {
                tentative = scanner.nextInt();
                display.display(hint());
                chancesToGuess--;
            }
        }
        if (chancesToGuess == 0){
            display.gameOverMessage();
        } else if (tentative == numberToGuess && chancesToGuess>-1) {
            display.WinMessage();
        }
    }

}
