package main.modul4.modul4_projekt.files.music;

import main.modul4.modul4_projekt.files.AbstractFile;
import main.modul4.modul4_projekt.files.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {
    protected String bandName;
    protected String title;

    public AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name, size);
        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }
}
