package main.modul4.modul4_projekt.usbdevice.audiodevices;

public class Headphones extends AbstractAudioDevice {


    public Headphones(String typeName) {
        super(typeName);
    }

    @Override
    public boolean connect() {
        System.out.println("Headphones connected,");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Headphones disconnected,");
        return true;
    }


}
