package zuper.programmer.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Mohammad");
        map.put("name.middle", "Sirajul");
        map.put("name.last", "Umam");

        // forloop
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // foreach anonymous class 
        map.forEach(new BiConsumer<String ,String>() {
            public void accept(String t, String u) {
                System.out.println(t + " : " + u);
            };
        });

        // lamda 
        map.forEach((t, u) -> System.out.println(t + " : " + u));
    }
}