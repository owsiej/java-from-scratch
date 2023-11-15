package main.modul4.modul4_projekt.files.image;

import main.modul4.modul4_projekt.Resolution;

import java.util.Map;

public class JPGImageFile extends AbstractImageFile {

    private final int compression;
    private Map<String, Integer> resolution;

    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
        this.resolution = Resolution.DEFAULT.getResolution();

    }

    public String setResolution(String newResolution) {
        resolution = Resolution.valueOf(newResolution.toUpperCase()).getResolution();
        return "Your current resolution is " + resolution;
    }

    public int getCompression() {
        return compression;
    }

    public Map<String, Integer> getResolution() {
        return resolution;
    }

    public void showImage() {
        System.out.println("Showing image");
    }

    @Override
    public String setName(String newName) {
        name = newName;
        return name;
    }
}
