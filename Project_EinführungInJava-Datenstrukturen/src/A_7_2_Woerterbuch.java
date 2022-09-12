import java.util.Map;
import java.util.Objects;

public class A_7_2_Woerterbuch {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addEntry("Hello", "Hallo");
        dictionary.addEntry("Dictionary", "Wörterbuch");
        dictionary.addEntry("Table", "Tisch");
        dictionary.addEntry("Weather", "Wetter");

        System.out.println("Willkommen in deinem persönlichen Wörterbuch!");

        outerloop:
        while (true) {
            while (true) {
                System.out.println("Was möchtest du tun?");
                System.out.println("1: Ein Wort übersetzen!");
                System.out.println("2: Ein neues Wort zum Wörterbuch hinzufügen!");
                System.out.println("3: Ein Wort aus dem Wörterbuch entfernen!");
                System.out.println("4: Wörterbuch verlassen!");
                int num = UserInput.getInt(1, 3, "Gib eine Zahl von 1 bis 3 ein!");
                if (num == 1) {
                    translate(dictionary);
                } else if (num == 2) {
                    addWord(dictionary);
                } else if (num == 3) {
                    deleteWord(dictionary);
                } else {
                    System.out.println("Danke für deinen Besuch!");
                    break outerloop;
                }
            }
        }

    }

    private static void deleteWord(Dictionary dictionary) {
        System.out.println("Welches Wort möchtest du entfernen?");
        String word = UserInput.getString("Gib ein Wort an!");
        if (dictionary.getMap().containsKey(word)) {
            dictionary.deleteEntry(word, dictionary.getMap().get(word));
            System.out.println("Wort wurde entfernt!");
        } else if (dictionary.getMap().containsValue(word)) {
            for (Map.Entry<String, String> entry : dictionary.getMap().entrySet()) {
                if (Objects.equals(word, entry.getValue())) {
                    dictionary.deleteEntry(entry.getKey(), word);
                }
            }
            System.out.println("Wort wurde entfernt!");
        } else {
            System.out.println("Dieses Wort exestiert leider nicht im Wörterbuch!");
        }
    }

    private static void addWord(Dictionary dictionary) {
        System.out.println("Gib das englische Wort an!");
        String english = UserInput.getString("Gib das englische Wort an!");
        System.out.println("Gib das deutsche Wort an!");
        String german = UserInput.getString("Gib das deutsche Wort an!");
        //todo -- check if Entry is valid
        dictionary.addEntry(english, german);
    }

    private static void translate(Dictionary dictionary) {
        System.out.println("Welches Wort möchtest du übersetzen?");
        String word = UserInput.getString("Gib ein Wort ein!");
        if (dictionary.getMap().containsKey(word)) {
            System.out.println(dictionary.getMap().get(word));
            System.out.println();
        } else if (dictionary.getMap().containsValue(word)) {
            for (Map.Entry<String, String> entry : dictionary.getMap().entrySet()) {
                if (Objects.equals(word, entry.getValue())) {
                    System.out.println(entry.getKey());
                    System.out.println();
                }
            }
        } else {
            System.out.println("Dieses Wort exestiert leider nicht im Wörterbuch!");
        }
    }
}


