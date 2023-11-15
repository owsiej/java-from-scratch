package apkja_oop.drive;

import apkja_oop.file_Notatki_Abstracja_Interfejsy.File_Notatki;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// klasa ktora implemetuje interfejs Drive
public class HDDDrive implements Drive {
    private List<File_Notatki> files = new ArrayList<>();

//    override - nadpisywanie metod z interfejsu
    @Override
    public void addFile(File_Notatki file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
        for (File_Notatki file :files) {
            System.out.println(file.getName());
        }
    }

    @Override
    public File_Notatki findFile(String name) {
        Optional<File_Notatki> foundFile = files.stream()
                .filter(file -> file.getName().equals(name))
                .findFirst();
        return foundFile.orElseThrow();
    }
}
