package models;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class PokemonBuilder {
    private String name;
    private ArrayList<String> types;
    private ArrayList<String> moves;
    private ArrayList<String> abilities;
    private BufferedImage image;

    public PokemonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PokemonBuilder setTypes(ArrayList<String> types) {
        this.types = types;
        return this;
    }

    public PokemonBuilder setMoves(ArrayList<String> moves) {
        this.moves = moves;
        return this;
    }

    public PokemonBuilder setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
        return this;
    }

    public PokemonBuilder setImage(BufferedImage image) {
        this.image = image;
        return this;
    }

    public Pokemon createPokemon() {
        return new Pokemon(name, types, moves, abilities, image);
    }
}