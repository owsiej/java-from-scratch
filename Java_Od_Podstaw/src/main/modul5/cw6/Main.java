package main.modul5.cw6;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
        Path path2 = Paths.get(args[1]);
        try {
            List<String> names = Files.readAllLines(path);
            List<String> namesWithA = new ArrayList<>();
            for (String name : names) {
                if (name.startsWith("A")) {
                    namesWithA.add(name);
                }
            }
            Files.write(path2, namesWithA);
        } catch (IOException e) {
            System.out.println("Podany plik nie istnieje.");
            throw new RuntimeException();
        }

    }
}
