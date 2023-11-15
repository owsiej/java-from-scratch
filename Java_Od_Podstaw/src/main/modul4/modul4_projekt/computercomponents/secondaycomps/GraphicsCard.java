package main.modul4.modul4_projekt.computercomponents.secondaycomps;

import main.modul4.modul4_projekt.computercomponents.Motherboard;

public class GraphicsCard extends ClockedComponents {

    private final String typeOfGraphicSystem;
    private final int memory;

    public GraphicsCard(String typeOfConnector,
                        double power,
                        double clocking,
                        int memory,
                        String typeOfGraphicSystem,
                        int warrantyLength,
                        String modelName) {
        super(typeOfConnector, power, clocking, warrantyLength, modelName);
        this.memory = memory;
        this.typeOfGraphicSystem = typeOfGraphicSystem;
    }

    public String getTypeOfGraphicSystem() {
        return typeOfGraphicSystem;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public boolean isCompatible(Motherboard motherboard) {
        return this.typeOfConnector.equals(motherboard.getGraphicsCardConnector());
    }
}
