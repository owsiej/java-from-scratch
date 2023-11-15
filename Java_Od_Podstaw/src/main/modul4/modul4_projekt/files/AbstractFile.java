package main.modul4.modul4_projekt.files;

public abstract class AbstractFile implements File {
    protected final int size;
    protected String name;

    public AbstractFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
}
