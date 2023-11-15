package main.modul4.modul4_projekt.usbdevice.audiodevices;

public class Speakers extends AbstractAudioDevice {


    public Speakers(String typeName) {
        super(typeName);
    }

    @Override
    public boolean connect() {
        System.out.println("Speakers connected,");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Speakers disconnected,");
        return true;
    }


}
