package main.modul4.modul4_projekt.usbdevice.audiodevices;

import main.modul4.modul4_projekt.usbdevice.USBDevice;

public interface AudioDevice extends USBDevice {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    String volumeUp(int volume);

    String volumeDown(int volume);
}
