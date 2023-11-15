package apkja_oop.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();

}
