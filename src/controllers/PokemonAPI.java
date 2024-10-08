package controllers;

import models.PokemonBuilder;
import models.Pokemon;
import org.json.JSONArray;
import org.json.JSONObject;
import views.PokemonView;

import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.awt.image.BufferedImage.TYPE_INT_RGB;

public class PokemonAPI {
    PokemonView view;

    public PokemonAPI(PokemonView view){
        this.view = view;

        view.attachGetPokeListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = view.getPokeName();

                if(name.isEmpty()){
                    view.displayError("You must enter a Pokemon name!");
                    return;
                }

                try {
                    Pokemon pokemon = getPokemon(name);
                    view.setPokeView(pokemon);
                } catch (RuntimeException ex){
                    System.err.println(ex);
                    view.displayError("Unable to find Pokemon. Try again!");
                }
            }
        });
    }

    private Pokemon getPokemon(String name) throws RuntimeException{

        // MAKE AN API CALL TO RETRIEVE POKEMON INFO
        // USE PRIVATE HELPER FUNCTIONS TO RETRIEVE DATA FROM JSON RESPONSE OBJECT
        // USE POKEMON BUILDER TO CREATE POKEMON OBJECT
        // RETURN OBJECT

        return new PokemonBuilder().createPokemon();
    }

    private ArrayList<String> getTypes(JSONObject obj){
        ArrayList<String> typeList = new ArrayList<>();

        // BUILD AN ARRAY LIST OF TYPES FROM THE PROVIDED OBJECT

        return typeList;
    }

    private ArrayList<String> getMoves(JSONObject obj){
        ArrayList<String> moveList = new ArrayList<>();

        // BUILD AN ARRAY LIST OF MOVES FROM THE PROVIDED OBJECT

        return moveList;
    }

    private ArrayList<String> getAbilities(JSONObject obj){
        ArrayList<String> abilityList = new ArrayList<>();

        // BUILD AN ARRAY LIST OF ABILITIES FROM THE PROVIDED OBJECT

        return abilityList;
    }

    private BufferedImage getImage(JSONObject obj){
        return null;
    }
}
