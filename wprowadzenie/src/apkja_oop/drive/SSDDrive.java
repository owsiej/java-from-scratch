package apkja_oop.drive;

import apkja_oop.file_Notatki_Abstracja_Interfejsy.File_Notatki;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive{
    private Map<String, File_Notatki> files = new HashMap<>();
    @Override
    public void addFile(File_Notatki file) {
       files.put(file.getName(), file);
    }

    @Override
    public void listFiles() {
        Collection<File_Notatki> fileCollection = files.values();

        for (File_Notatki file:fileCollection) {
            System.out.println(file.getName());
        }

    }

    @Override
    public File_Notatki findFile(String name) {
        return files.get(name);
    }
}
