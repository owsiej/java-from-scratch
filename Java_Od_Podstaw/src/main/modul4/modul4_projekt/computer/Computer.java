package main.modul4.modul4_projekt.computer;

import main.modul4.modul4_projekt.computercomponents.Charger;
import main.modul4.modul4_projekt.computercomponents.Motherboard;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.GraphicsCard;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.Processor;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.RAMMemory;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.drive.Drive;
import main.modul4.modul4_projekt.files.File;
import main.modul4.modul4_projekt.usbdevice.USBDevice;

import java.util.*;
import java.util.ArrayList;

public abstract class Computer {
    protected Drive drive;
    protected GraphicsCard graphicsCard;
    protected Processor processor;
    protected RAMMemory ramMemory;
    protected Charger charger;
    protected Motherboard motherboard;
    protected List<USBDevice> usbDevices = new ArrayList<>();

    public Computer(
            Drive drive,
            GraphicsCard graphicsCard,
            Processor processor,
            RAMMemory ramMemory,
            Charger charger,
            Motherboard motherboard) {
        this.drive = drive;
        this.graphicsCard = graphicsCard;
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.charger = charger;
        this.motherboard = motherboard;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAMMemory getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(RAMMemory ramMemory) {
        this.ramMemory = ramMemory;
    }

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }

    public void addUSBDevice(USBDevice usbDevice) {
        if (usbDevices.size() >= motherboard.getAmountOfUSBPorts()) {
            System.out.println("You don't have enough free ports to add USBDevice");
            return;
        }
        boolean isConnect = usbDevice.connect();
        if (isConnect) {
            usbDevices.add(usbDevice);
        }
    }

    public void removeUSBDevice(USBDevice usbDevice) {
        boolean isDisconnected = usbDevice.disconnect();
        if (!isDisconnected) {
            System.out.println("USB Device forcefully disconnected.");
        }
        usbDevices.remove(usbDevice);

    }

    public void addFile(File file) {
        drive.addFile(file);
    }

    public void listFiles() {
        drive.listFile();
    }

    public File findFile(String fileName) {
        return drive.findFile(fileName);
    }

    public boolean areAllComponentsCompatible() {
        return drive.isCompatible(motherboard) &&
                processor.isCompatible(motherboard) &&
                graphicsCard.isCompatible(motherboard) &&
                ramMemory.isCompatible(motherboard) &&
                charger.isCompatible(motherboard) &&
                charger.isCompatible(processor, ramMemory, graphicsCard, drive);
    }
}
