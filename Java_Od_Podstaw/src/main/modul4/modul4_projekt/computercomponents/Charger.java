package main.modul4.modul4_projekt.computercomponents;

import main.modul4.modul4_projekt.computercomponents.secondaycomps.*;
import main.modul4.modul4_projekt.computercomponents.secondaycomps.drive.Drive;

public class Charger extends Hardware implements Components {

    public Charger(int warrantyLength, double power, String typeOfConnector, String modelName) {
        super(warrantyLength, power, modelName, typeOfConnector);
        this.typeOfConnector = typeOfConnector;
    }


    @Override
    public boolean isCompatible(Motherboard motherboard) {
        return this.typeOfConnector.equals(motherboard.getChargerConnector());
    }

    public boolean isCompatible(Processor processor, RAMMemory ramMemory, GraphicsCard graphicsCard, Drive drive) {
        return this.power >= 1.5 * (processor.getPower() + ramMemory.getPower() + graphicsCard.getPower() + ((Hardware) drive).getPower());
    }
}
