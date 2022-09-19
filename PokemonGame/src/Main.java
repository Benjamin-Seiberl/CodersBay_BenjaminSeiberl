import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int indexCom = r.nextInt(152) - 1;
        Pokedex pokedex = new Pokedex();
        pokedex.fill();
        System.out.println("Choose a Pokemon! (1 - 152)");
        int index = UserInput.getInt(1, 152,"Your number must be between 1 and 152!") - 1;

        Pokemon p1 = new Pokemon(pokedex.get(index));
        Pokemon p2 = new Pokemon(pokedex.get(indexCom));

        Arena arena = new Arena(p1, p2, pokedex.getModifierNames());
        pokedex.print_pokemon(index+1);
        System.out.printf("\n\n\t\t\t\t%-10s vs %10s\n\n", p1.getName(),p2.getName());
        pokedex.print_pokemon(indexCom+1);

        arena.start();
    }
}
