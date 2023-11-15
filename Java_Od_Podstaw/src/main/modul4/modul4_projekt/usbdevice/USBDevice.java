package main.modul4.modul4_projekt.usbdevice;

public interface USBDevice {

    boolean connect();

    boolean disconnect();

    String typeName();
}
