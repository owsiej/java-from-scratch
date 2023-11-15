package main.modul5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/mod5/todo.txt");
        List<String> lines = Files.readAllLines(path);
        System.out.println(lines);

        List<String> toDo = new ArrayList<>();
        toDo.add("umyc lustro");
        toDo.add("ugotowac obiad");
        Files.write(path, toDo, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}
