package zuper.programmer.app;

import zuper.programmer.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        // tanpa lamda
        SimpleAction withoutLamda = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Mohammad";
            }
        };
        System.out.println(withoutLamda.action("Mohammad"));

        // menggunakan lamda
        SimpleAction simpleAction = (String name) -> { return "Mohammad"; };
        System.out.println(simpleAction.action("Mohammad"));
        
        // menggunakan lamda
        SimpleAction simpleAction1 = (String nama) -> { return "Hello " + nama; };
        
        // menggunakan lamda
        SimpleAction simpleAction2 = (nama) -> { return "Selamat Datang " + nama; };
        
        // menggunakan lamda
        SimpleAction simpleAction3 = (String nama) -> "Selamat Datang " + nama;
        
        // menggunakan lamda
        SimpleAction simpleAction4 = (nama) -> "Selamat Datang " + nama;
        
        // menggunakan lamda
        SimpleAction simpleAction5 = nama -> "Selamat Datang " + nama;
    }
}
