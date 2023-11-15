package main.modul4.modul4_projekt;

import main.modul4.modul4_projekt.computercomponents.Charger;
import main.modul4.modul4_projekt.computercomponents.Motherboard;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.drive.HDDDrive;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.drive.SDDDrive;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.GraphicsCard;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.Processor;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.RAMMemory;
import main.modul4.modul4_projekt.files.image.JPGImageFile;
import main.modul4.modul4_projekt.usbdevice.Keyboard;
import main.modul4.modul4_projekt.usbdevice.Mouse;

public class Main {
    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard("AM5",
                128,
                "DDR5",
                "SATAIII",
                "B650",
                5,
                "PCle 4.0x16",
                36,
                "24 pin",
                100,
                "GIGABYTE",
                "ATX");
        Charger charger = new Charger(24, 600, "24 pin", "ENDORFY");
        Processor processor = new Processor("AM5",
                110,
                3.7,
                12,
                "B650",
                36,
                "AMD");
        RAMMemory ramMemory = new RAMMemory("DDR5",
                15,
                0.6,
                32,
                100,
                "Kingston");
        GraphicsCard graphicsCard = new GraphicsCard("PCle 4.0x16",
                250,
                1.6,
                12,
                "RADEON",
                36,
                "RADEON");
        SDDDrive sddDrive = new SDDDrive(36, 3, "GIGABYTE", "SATAIII");
        HDDDrive hddDrive = new HDDDrive(36, 2, "SAMSUNG", "SATAIII");
        Monitor monitor = new Monitor("DELL", 32, "16:9");
        Mouse mouse = new Mouse("Logitech");
        Keyboard keyboard = new Keyboard("Genesys");
        Monitor iiyama = new Monitor("IIYAMA", 5.8, "16:9");
        JPGImageFile jpgImageFile = new JPGImageFile("photo.jpg", 20, 5);
        Converter.toPDF(jpgImageFile);

//        DesktopComputer desktopComputer = new DesktopComputer(sddDrive, graphicsCard, processor, ramMemory, charger, motherboard, mouse, keyboard, monitor);
//        System.out.println(desktopComputer.areAllComponentsCompatible());
//        System.out.println(desktopComputer.getUsbDevices());
//        System.out.println(charger.isCompatible(motherboard));
//        System.out.println(charger.isCompatible(processor, ramMemory, graphicsCard, hddDrive));
//        System.out.println(processor.isCompatible(motherboard));
//        System.out.println(ramMemory.isCompatible(motherboard));
//        System.out.println(graphicsCard.isCompatible(motherboard));
//        System.out.println(sddDrive.isCompatible(motherboard));
//        System.out.println(hddDrive.isCompatible(motherboard));
    }
}
