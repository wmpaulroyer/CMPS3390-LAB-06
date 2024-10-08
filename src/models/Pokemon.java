package models;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Pokemon {
    private final String name;
    private final ArrayList<String> types;
    private final ArrayList<String> moves;
    private final ArrayList<String> abilities;
    BufferedImage image;

    Pokemon() {
        this(null, null, null, null, null);
    }

    Pokemon(String name, ArrayList<String> types, ArrayList<String> moves, ArrayList<String> abilities, BufferedImage image) {
        this.name = name;
        this.types = types;
        this.moves = moves;
        this.abilities = abilities;
        this.image = image;
    }

    public BufferedImage getImage(){
        return this.image;
    }

    @Override
    public String toString() {
        return "NAME: " + this.name + "\n\n" +
                "TYPES: " + this.types + "\n\n" +
                "MOVES: " + this.moves + "\n\n" +
                "ABILITIES: " + this.abilities + "\n\n";
    }
}
