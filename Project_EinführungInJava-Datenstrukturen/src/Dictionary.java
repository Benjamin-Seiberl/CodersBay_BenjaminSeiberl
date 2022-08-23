import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> map = new HashMap<>();

    public Map<String, String> getMap() {
        return map;
    }
    public void addEntry(String english, String german) {
        map.put(english, german);
    }

    public void deleteEntry(String english, String german) {
        map.remove(english, german);
    }

}
