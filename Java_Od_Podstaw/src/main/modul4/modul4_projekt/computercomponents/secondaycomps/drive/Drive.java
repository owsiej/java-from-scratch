package main.modul4.modul4_projekt.computercomponents.secondaycomps.drive;

import main.modul4.modul4_projekt.computercomponents.secondaycomps.Components;
import main.modul4.modul4_projekt.files.File;

public interface Drive extends Components {
    void addFile(File file);

    void listFile();

    File findFile(String fileName);
}
