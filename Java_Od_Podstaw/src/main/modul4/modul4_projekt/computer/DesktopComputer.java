package main.modul4.modul4_projekt.computer;

import main.modul4.modul4_projekt.Monitor;
import main.modul4.modul4_projekt.computercomponents.Charger;
import main.modul4.modul4_projekt.computercomponents.Motherboard;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.GraphicsCard;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.Processor;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.RAMMemory;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.drive.Drive;
import main.modul4.modul4_projekt.usbdevice.Keyboard;
import main.modul4.modul4_projekt.usbdevice.Mouse;

public class DesktopComputer extends Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor monitor;

    public DesktopComputer(
            Drive drive,
            GraphicsCard graphicsCard,
            Processor processor,
            RAMMemory ramMemory,
            Charger charger,
            Motherboard motherboard,
            Mouse mouse,
            Keyboard keyboard,
            Monitor monitor) {
        super(drive, graphicsCard, processor, ramMemory, charger, motherboard);
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.addUSBDevice(keyboard);
        this.addUSBDevice(mouse);
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
