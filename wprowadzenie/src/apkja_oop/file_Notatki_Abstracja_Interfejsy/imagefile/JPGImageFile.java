package apkja_oop.file_Notatki_Abstracja_Interfejsy.imagefile;


public class JPGImageFile extends AbstractImageFile {

    private int compression;
    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }



    public int getCompression() {

        return compression;
    }
    public void displayImage() {

        System.out.println("Displaying JPG image");
    }

}
