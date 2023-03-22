package org.example.views;

public class DisplayView {

    private String chooseRange = "Choisissez la limite à laquelle vous souhaitez jouer (maximum 300!)";
    private String errorInteger = "RENSEIGNEZ UN ENTIER!";
    private String errorOutOfBounds = "ON A DIT ENTRE 0 ET 300";

    private String gameOverMessage = "Perdu !";
    private String winMessage = "Bien joué vous avez gagné!";
    private String howManyChances = "Vous avez : ";


    public void display(String s) {
        System.out.println(s);
    }

    public void chooseRangeMessage(){
        System.out.println(chooseRange);
    }
    public void errorInteger() {
        System.out.println(errorInteger);
    }

    public void errorOutOfBounds() {
        System.out.println(errorOutOfBounds);
    }

    public void gameOverMessage() {
        System.out.println(gameOverMessage);
    }

    public void WinMessage() {
        System.out.println(winMessage);
    }
    public void howManyChances(int chancesToGuess){
        System.out.println(howManyChances + chancesToGuess + " tentatives pour gagner!");
    }
}
