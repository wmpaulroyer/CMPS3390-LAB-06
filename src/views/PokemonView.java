package views;

import models.Pokemon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static java.awt.Image.SCALE_SMOOTH;

public class PokemonView extends JFrame {
    private JPanel panelMain;
    private JTextField textFieldPokeName;
    private JButton buttonGetPoke;
    private JPanel panelInputs;
    private JLabel pokeImage;
    private JTextArea textPokeInfo;

    public PokemonView(){
        setContentPane(panelMain);
        setTitle("Pokemon App");
        setSize(750, 750);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getPokeName(){
        return textFieldPokeName.getText();
    }

    public void setPokeView(Pokemon pokemon){
        Image scaled = pokemon.getImage().getScaledInstance(300, 300, SCALE_SMOOTH);
        pokeImage.setIcon(new ImageIcon(scaled));
        textPokeInfo.setText(pokemon.toString());
    }

    public void attachGetPokeListener(ActionListener listener) {
        buttonGetPoke.addActionListener(listener);
        textFieldPokeName.addActionListener(listener);
    }

    public void displayError(String error){
        JOptionPane.showMessageDialog(this, error);
    }
}
