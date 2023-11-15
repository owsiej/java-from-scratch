package main.modul4.modul4_projekt.files.music;

public class MP3File extends AbstractMusicFile {

    private final int quality;

    public MP3File(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public void play() {
        System.out.println("Playing Mp3 File");
    }

    @Override
    public String setName(String newName) {
        name = newName;
        return newName;
    }
}
