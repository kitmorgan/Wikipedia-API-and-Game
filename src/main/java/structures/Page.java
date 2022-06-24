package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page {
    String address;
    Map<String, Integer> keyWords = new HashMap<>(); // word, count
    List<String> keyLinks = new ArrayList<>();

    public Page(String address){
        this.address = address;
        this.keyWords = getKeyWords(address);
        this.keyLinks = this.getKeyLinks(address);
    }

    public Map<String, Integer> getKeyWords(String link){
        return null;
    }

    public List<String> getKeyLinks(String link){
        return null;
    }
}
