public class A_7_2_Wörterbuch {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.addEntry("Hello", "Hallo");
        dictionary.addEntry("Dictionary", "Wörterbuch");
        dictionary.addEntry("Table", "Tisch");
        dictionary.addEntry("Weather", "Wetter");

        dictionary.deleteEntry("Hello", "Hallo");

        
    }
}


