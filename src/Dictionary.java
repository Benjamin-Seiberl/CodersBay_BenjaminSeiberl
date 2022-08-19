import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    Map<String, String> map = new HashMap<>();

    public void addEntry(String english, String german) {
        map.put(english, german);
    }

    public void deleteEntry(String english, String german) {
        map.remove(english, german);
    }
}
