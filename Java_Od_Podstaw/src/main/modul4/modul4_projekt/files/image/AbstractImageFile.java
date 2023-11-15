package main.modul4.modul4_projekt.files.image;

import main.modul4.modul4_projekt.files.AbstractFile;
import main.modul4.modul4_projekt.files.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    public AbstractImageFile(String name, int size) {
        super(name, size);

    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
