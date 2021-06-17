package com.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }
}

class Player {
    Map<String, Integer> gems;
    List<Card> cards;

    Player(Map<String, Integer> gems) {
        this.gems = gems;
        this.cards = new ArrayList<>();
    }

    public Map<String,Integer> getGems() {
        return this.gems;
    }


    public List<Card> getCards() {
        return cards;
    }

    public void populateCards(Card card) {
        cards.add(card);
    }
}

class Card {
    Map<String, Integer> gems;
    String color;

    Card(String color, Map<String, Integer> gems) {
        this.gems = gems;
        this.color = color;
    }

    public Map<String,Integer> getGems() {
        return this.gems;
    }

    public String getColor() {
        return this.color;
    }
}

class Game {
    Player player;

    Game(Player player) {
        this.player = player;
    }

    private boolean couldAffordTheCard(Card card) {
        HashMap<String, Integer> playerGems = (HashMap<String, Integer>) player.getGems();
        HashMap<String, Integer> cardGems = (HashMap<String, Integer>) card.getGems();

        return !cardGems.entrySet().stream().map(e -> playerGems.containsKey(e.getKey()) &&
                playerGems.get(e.getKey()) >= e.getValue()).collect(Collectors.toList()).contains(false);
    }

    public Map<String, Integer> purchaseCard(Card card) {
        HashMap<String, Integer> cardGems = (HashMap<String, Integer>) card.getGems();

        if(couldAffordTheCard(card)) {
            player.getGems().entrySet().forEach(e -> {
                Integer amountToWithdraw = cardGems.get(e.getKey()) - canDiscount(card, player.getCards());
                e.setValue(e.getValue() - amountToWithdraw);
            });

            player.populateCards(card);
        }

        return player.getGems();

    }
    // Card requires 3g
    // Player has 2G + 1C(G)
    // Purchase
    // decrease amount from gems
    public Integer canDiscount(Card card, List<Card> playerCards) {
        //identify if playerCards has Color of required gems for this card;
        card.getGems().entrySet().stream().map(v -> {
            //should return the number of cards to use as discount
            return playerCards.stream().filter( pc -> pc.getColor().equals(v.getKey())).count();
        });

        //TODO: Return count of cards to discount
        return 0;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> playerGem = new HashMap<>();
        playerGem.put("W", 3);
        playerGem.put("G", 2);
        playerGem.put("R", 1);

        HashMap<String, Integer> cardGem = new HashMap<>();
        cardGem.put("W", 2);
        cardGem.put("G", 2);
        cardGem.put("R", 1);

        Player p1 = new Player(playerGem);
        Card c1 = new Card("G", cardGem);

        Game g = new Game(p1);
        g.purchaseCard(c1);


    }
}