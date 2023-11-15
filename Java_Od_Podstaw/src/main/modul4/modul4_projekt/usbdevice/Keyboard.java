package main.modul4.modul4_projekt.usbdevice;

public record Keyboard(String typeName) implements USBDevice {

    @Override
    public boolean connect() {
        System.out.println("Keyboard connected.");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Keyboard disconnected.");
        return true;
    }
}
