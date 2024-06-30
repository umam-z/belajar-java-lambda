package zuper.programmer.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Mohammad", "Sirajul", "Umam"));

        // removeIf anonymous class
        list.removeIf(new Predicate<String>() {
            public boolean test(String t) {
                return t.length() > 5;
            };
        });

        // lamda
        list.removeIf(name -> name.length() > 5);
    }
}
