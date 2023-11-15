package main.modul4.modul4_projekt.usbdevice;

public class MemoryStick implements USBDevice {
    private final String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Memory stick connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (ejected) {
            System.out.println("Memory stick diconnected");
            return true;
        } else {
            System.out.println("Please eject memory stick first.");
            return false;
        }

    }

    @Override
    public String typeName() {
        return name;
    }

    public void eject() {
        System.out.println("Ejected memory stick.");
        ejected = true;
    }
}
