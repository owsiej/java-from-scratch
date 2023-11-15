package main.modul4.modul4_projekt.computercomponents.secondaycomps.drive;

import main.modul4.modul4_projekt.computercomponents.secondaycomps.Hardware;
import main.modul4.modul4_projekt.computercomponents.Motherboard;
import main.modul4.modul4_projekt.files.File;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive extends Hardware implements Drive {
    List<File> files = new ArrayList<>();

    public HDDDrive(int warrantyLength, int power, String modelName, String typeOfConnector) {
        super(warrantyLength, power, modelName, typeOfConnector);
    }

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFile() {
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String fileName) {
        for (File file : files) {
            if (fileName.equals(file.getName())) {
                return file;
            }
        }
        return null;
    }

    @Override
    public boolean isCompatible(Motherboard motherboard) {
        return this.typeOfConnector.equals(motherboard.getSataConnector());
    }
}
