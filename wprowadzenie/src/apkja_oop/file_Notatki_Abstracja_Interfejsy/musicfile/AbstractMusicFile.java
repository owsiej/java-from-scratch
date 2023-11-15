package apkja_oop.file_Notatki_Abstracja_Interfejsy.musicfile;

import apkja_oop.file_Notatki_Abstracja_Interfejsy.AbstractFile_Notatki;
import apkja_oop.file_Notatki_Abstracja_Interfejsy.Filetype;

public abstract class AbstractMusicFile extends AbstractFile_Notatki implements MusicFile{
    protected String bandName;
    protected String title;
    protected AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name, size);

        this.bandName = bandName;
        this.title = title;
    }


    @Override
    public Filetype getType() {
        return Filetype.MUSIC;
    }


}
