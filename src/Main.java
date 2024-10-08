import controllers.PokemonAPI;
import views.PokemonView;

public class Main {
    public static void main(String[] args) {
        PokemonView view = new PokemonView();
        new PokemonAPI(view);

        view.setVisible(true);
    }
}
