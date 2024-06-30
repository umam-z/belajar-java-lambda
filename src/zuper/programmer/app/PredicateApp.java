package zuper.programmer.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        // Predicate<String> predicate = new Predicate<String>() {
        //     @Override
        //     public boolean test(String t) {
        //         return t.isBlank();
        //     }
        // };

        // vscode
        // Predicate<String> predicate = String::isBlank;
        Predicate<String> predicate = name -> name.isBlank();

        System.out.println(predicate.test(" "));
        System.out.println(predicate.test("Mohammad"));
    }
}
