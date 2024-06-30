package zuper.programmer;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Mohammad", "Sirajul", "Umam");

        // menggunakan forloop
        for (String string : list) {
            System.out.println(string);
        }

        // forEach menggunakan anonymous class
        list.forEach(new Consumer<String>() {
            public void accept(String t) {
                System.out.println(t);
            };
        });

        // lamda
        // Consumer<String> lamda = t -> System.out.println(t);
        list.forEach(t -> System.out.println(t));
        
        // lamda method reference
        list.forEach(System.out::println);
    }
}
