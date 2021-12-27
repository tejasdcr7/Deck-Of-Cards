package com.bridgelabz.day11;

public class Deck {

    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

// Initialize cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

// Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
// Generate an index randomly
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

// Display the first nine cards
        for (int i = 0; i < 9; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Player 1 " + deck[i] + ": "
                    + rank + " of " + suit);
        }
        for (int i = 0; i < 9; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Player 2 " + deck[i] + ": "
                    + rank + " of " + suit);
        }
        for (int i = 0; i < 9; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Player 3 " + deck[i] + ": "
                    + rank + " of " + suit);
        }
        for (int i = 0; i < 9; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Player 4 " + deck[i] + ": "
                    + rank + " of " + suit);
        }
    }
}