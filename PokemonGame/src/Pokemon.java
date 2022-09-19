import java.util.ArrayList;

public class Pokemon {

    //region fields
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private String type1;
    private String type2;
    private ArrayList<String> abilities;
    private ArrayList<Double> effectiveAgainstType;
    //endregion

    //region Constructors
    public Pokemon(String name, int hp, int attack, int defense, int speed, String type1, String type2, ArrayList<String> abilities, ArrayList<Double> effectiveAgainstType) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.type1 = type1;
        this.type2 = type2;
        this.abilities = abilities;
        this.effectiveAgainstType = effectiveAgainstType;
    }

    public Pokemon(Pokemon another) {
        this.name = another.name;
        this.hp = another.hp;
        this.attack = another.attack;
        this.defense = another.defense;
        this.speed = another.speed;
        this.type1 = another.type1;
        this.type2 = another.type2;
        this.abilities = another.abilities;
        this.effectiveAgainstType = another.effectiveAgainstType;
    }
    //endregion

    //region Getter and Setter
    public ArrayList<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<Double> getEffectiveAgainstType() {
        return effectiveAgainstType;
    }

    public void setEffectiveAgainstType(ArrayList<Double> effectiveAgainstType) {
        this.effectiveAgainstType = effectiveAgainstType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }
    //endregion

    //region ToString
    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                '}';
    }
    //endregion

}
