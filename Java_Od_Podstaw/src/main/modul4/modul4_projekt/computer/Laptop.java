package main.modul4.modul4_projekt.computer;

import main.modul4.modul4_projekt.computercomponents.Charger;
import main.modul4.modul4_projekt.computercomponents.Motherboard;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.GraphicsCard;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.Processor;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.RAMMemory;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.drive.Drive;

public class Laptop extends Computer {
    private final String display;

    public Laptop(Drive drive, GraphicsCard graphicsCard, Processor processor, RAMMemory ramMemory, Charger charger, Motherboard motherboard, String display) {
        super(drive, graphicsCard, processor, ramMemory, charger, motherboard);
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }
}
