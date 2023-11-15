package main.modul4.modul4_projekt.computercomponents.secondaycomps;

import main.modul4.modul4_projekt.computercomponents.Motherboard;

public class RAMMemory extends ClockedComponents {
    private final int capacity;

    public RAMMemory(String typeOfConnector, double power, double clocking, int capacity, int warrantyLength, String modelName) {
        super(typeOfConnector, power, clocking, warrantyLength, modelName);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean isCompatible(Motherboard motherboard) {
        return this.typeOfConnector.equals(motherboard.getSupportedRAMMemory()) && this.capacity <= motherboard.getMaxAmountOfRAMMemory();
    }
}
