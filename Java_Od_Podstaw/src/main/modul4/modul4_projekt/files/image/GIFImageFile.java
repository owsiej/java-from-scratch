package main.modul4.modul4_projekt.files.image;

public class GIFImageFile extends AbstractImageFile {


    public GIFImageFile(String name, int size) {
        super(name, size);
    }

    public void showAnimation() {
        System.out.println("Showing funny gif.");
    }

    @Override
    public String setName(String newName) {
        name = newName;
        return newName;
    }
}
