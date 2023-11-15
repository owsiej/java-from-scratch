package main.modul4.modul4_projekt.usbdevice;

public record Mouse(String typeName) implements USBDevice {

    @Override
    public boolean connect() {
        System.out.println("Mouse connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Mouse disconnected");
        return true;
    }
}
