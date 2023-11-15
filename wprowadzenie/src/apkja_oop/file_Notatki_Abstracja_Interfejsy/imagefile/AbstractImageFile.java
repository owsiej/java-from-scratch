package apkja_oop.file_Notatki_Abstracja_Interfejsy.imagefile;

import apkja_oop.file_Notatki_Abstracja_Interfejsy.AbstractFile_Notatki;
import apkja_oop.file_Notatki_Abstracja_Interfejsy.Filetype;

public abstract class AbstractImageFile extends AbstractFile_Notatki {


    protected AbstractImageFile(String name, int size) {
            super(name, size);
    }

    @Override
    public Filetype getType() {
        return Filetype.IMAGE;
    }
}
