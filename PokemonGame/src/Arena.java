import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Arena {
    //region Fields
    private Pokemon pokemon1;
    private int hpPokemon1;
    private Pokemon pokemon2;
    private int hpPokemon2;
    private ArrayList<String> modifierNames;
    //endregion

    //region Constructors
    public Arena(Pokemon pokemon1, Pokemon pokemon2, ArrayList<String> modifierNames) {
        this.pokemon1 = pokemon1;
        hpPokemon1 = pokemon1.getHp();
        this.pokemon2 = pokemon2;
        hpPokemon2 = pokemon2.getHp();
        this.modifierNames = modifierNames;
    }
    //endregion

    //region Methods
    public void start() {
        while (hpPokemon1 > 0 && hpPokemon2 > 0) {
            printAbilities();
            fight();
        }
        printWinner();
    }

    private void fight() {
        Random r = new Random();

        //Attack Pokemon 1
        int input = UserInput.getInt(0,pokemon1.getAbilities().size()-1,"Choose an valid ability!");
        int damage = calculateDamage(pokemon1, pokemon2,pokemon1.getAttack(), pokemon2.getDefense());
        System.out.println(pokemon1.getName() + " attacks with " + pokemon1.getAbilities().get(input) + ". " + pokemon1.getName() + " deals " + damage + " damage.\n");
        hpPokemon2 -= damage;

        //Attack Pokemon 2
        if(pokemon2.getAbilities().size() != 1){
            input = r.nextInt(pokemon2.getAbilities().size());
        }else{
            input = 0;
        }
        damage = calculateDamage(pokemon2, pokemon1,pokemon2.getAttack(), pokemon1.getDefense());
        System.out.println(pokemon2.getName() + " attacks with " + pokemon2.getAbilities().get(input) + ". " + pokemon2.getName() + " deals " + damage + " damage.\n");
        hpPokemon1 -= damage;
    }

    public int calculateDamage(Pokemon p1 , Pokemon p2, int attack, int defense){
        String t1 = p1.getType1();
        String t2 = p1.getType2();
        int index1 = modifierNames.indexOf(t1);
        int index2 = modifierNames.indexOf(t2);
        double typeModifier1 = p2.getEffectiveAgainstType().get(index1);
        double typeModifier2 = 1;
        if(index2 != -1){
            typeModifier2 = p2.getEffectiveAgainstType().get(index2);
        }
        if(typeModifier1*typeModifier2 > 1){
            System.out.println("It's super effective!");
        }else if(typeModifier1*typeModifier2 < 1){
            System.out.println("It's not very effective!");
        }
        double attackRoll =  Math.random();
        double defenseRoll = (Math.random() * 0.5);
        int attackAfterRoll = (int)(attack * attackRoll * typeModifier1 * typeModifier2);
        int defenseAfterRoll = (int)(defense * defenseRoll);
        int damage = attackAfterRoll - defenseAfterRoll;
        if(damage < 0){
            damage = 0;
        }
        return damage;
    }

    public void printAbilities(){
        System.out.println("\n\n");
        System.out.printf("\n%s (%d/%d <3)%-5s", pokemon1.getName(), hpPokemon1, pokemon1.getHp(), "");
        System.out.printf("%s (%d/%d <3)%-5s", pokemon2.getName(), hpPokemon2, pokemon2.getHp(), "");
        System.out.println();

        int length = pokemon1.getAbilities().size()>=pokemon2.getAbilities().size() ? pokemon1.getAbilities().size() : pokemon2.getAbilities().size();
        for (int i = 0; i < length; i++) {
            System.out.print("(" + i + ")");
            if(i < pokemon1.getAbilities().size()){
                System.out.printf("%-22s" ,pokemon1.getAbilities().get(i));
            }else{
                System.out.printf("%-22s" , "");
            }
            if(i < pokemon2.getAbilities().size()){
                System.out.printf("%-22s" ,pokemon2.getAbilities().get(i));
            }else{
                System.out.printf("%-22s" , "");
            }
            System.out.println();
        }
    }

    private void printWinner() {
        if (hpPokemon1 > 0) {
            System.out.println("----- " + pokemon2.getName() + " fainted! -----");
            System.out.println("----- The winner is: " + pokemon1.getName() + " -----");
        }else{
            System.out.println("----- " + pokemon1.getName() + " fainted! -----");
            System.out.println("----- The winner is: " + pokemon2.getName() + " -----");
        }
    }
    //endregion


}
