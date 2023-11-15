package apkja_oop.drive;

import apkja_oop.file_Notatki_Abstracja_Interfejsy.File_Notatki;

public interface Drive {
    void addFile(File_Notatki file);
    void listFiles();
    File_Notatki findFile(String name);
}
