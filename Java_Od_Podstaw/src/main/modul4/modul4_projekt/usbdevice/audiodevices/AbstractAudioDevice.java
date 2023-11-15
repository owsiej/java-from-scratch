package main.modul4.modul4_projekt.usbdevice.audiodevices;

public abstract class AbstractAudioDevice implements AudioDevice {
    protected final String typeName;
    protected int currentVolume;

    public AbstractAudioDevice(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String typeName() {
        return typeName;
    }

    @Override
    public String volumeUp(int volume) {

        if (currentVolume + volume <= MAX_VOLUME) {
            currentVolume += volume;
            return "Your current volume is " + currentVolume;
        }
        return "You can't volume up that much";
    }

    @Override
    public String volumeDown(int volume) {
        if (currentVolume - volume >= MIN_VOLUME) {
            currentVolume -= volume;
            return "Your current volume is " + currentVolume;
        }
        return "You can't volume down that much";
    }
}
