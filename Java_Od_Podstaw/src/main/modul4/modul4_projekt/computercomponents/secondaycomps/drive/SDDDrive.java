package main.modul4.modul4_projekt.computercomponents.secondaycomps.drive;

import main.modul4.modul4_projekt.computercomponents.secondaycomps.Hardware;
import main.modul4.modul4_projekt.computercomponents.Motherboard;
import main.modul4.modul4_projekt.files.File;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SDDDrive extends Hardware implements Drive {

    Map<String, File> files = new HashMap<>();

    public SDDDrive(int warrantyLength, int power, String modelName, String typeOfConnector) {
        super(warrantyLength, power, modelName, typeOfConnector);
    }

    @Override
    public void addFile(File file) {
        files.put(file.getName(), file);
    }

    @Override
    public void listFile() {
        Set<String> fileNames = files.keySet();
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
    }

    @Override
    public File findFile(String fileName) {
        return files.get(fileName);
    }

    @Override
    public boolean isCompatible(Motherboard motherboard) {
        return this.typeOfConnector.equals(motherboard.getSataConnector());
    }
}
