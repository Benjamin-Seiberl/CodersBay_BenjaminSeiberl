import java.util.Map;
import java.util.Objects;

public class A_7_2_Wörterbuch {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addEntry("Hello", "Hallo");
        dictionary.addEntry("Dictionary", "Wörterbuch");
        dictionary.addEntry("Table", "Tisch");
        dictionary.addEntry("Weather", "Wetter");


        System.out.println("Willkommen in deinem persönlichen Wörterbuch!");
        while(true){
            System.out.println("Was möchtest du tun?");
            System.out.println("1: Ein Wort übersetzen!");
            System.out.println("2: Ein neues Wort zum Wörterbuch hinzufügen!");
            System.out.println("3: Ein Wort aus dem Wörterbuch entfernen!");
            System.out.println("4: Wörterbuch verlassen");
            int num = UserInput.getInt(1,3,"Gib eine Zahl von 1 bis 3 ein!");
            if(num == 1){
                System.out.println("Welches Wort möchtest du übersetzen?");
                String word = UserInput.getString("Gib ein Wort ein!");
                if(dictionary.getMap().containsKey(word)){
                    System.out.println(dictionary.getMap().get(word));
                }else if(dictionary.getMap().containsValue(word)){
                    for (Map.Entry<String, String> entry : dictionary.getMap().entrySet()) {
                        if (Objects.equals(word, entry.getValue())) {
                            System.out.println(entry.getKey());
                        }
                    }
                }
            }else if(num == 2) {
                System.out.println("Gib das englische Wort an!");
                String english = UserInput.getString("Gib das englische Wort an!");
                System.out.println("Gib das deutsche Wort an!");
                String german = UserInput.getString("Gib das deutsche Wort an!");
                dictionary.addEntry(english, german);

            }else if(num == 3){
                System.out.println("Welches Wort möchtest du entfernen?");
                String word = UserInput.getString("Gib ein Wort an!");


            }else{
                break;
            }

        }




        
    }
}


