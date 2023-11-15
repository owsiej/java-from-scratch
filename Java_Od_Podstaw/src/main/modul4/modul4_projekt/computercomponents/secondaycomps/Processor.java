package main.modul4.modul4_projekt.computercomponents.secondaycomps;

import main.modul4.modul4_projekt.computercomponents.Motherboard;

public class Processor extends ClockedComponents {

    private final int numberOfCores;
    private final String supportedChipset;

    public Processor(String typeOfConnector,
                     double power,
                     double clocking,
                     int numberOfCores,
                     String supportedChipset,
                     int warrantyLength,
                     String modelName) {
        super(typeOfConnector, power, clocking, warrantyLength, modelName);
        this.numberOfCores = numberOfCores;
        this.supportedChipset = supportedChipset;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getSupportedChipset() {
        return supportedChipset;
    }

    @Override
    public boolean isCompatible(Motherboard motherboard) {
        return this.typeOfConnector.equals(motherboard.getProcessorSocket()) && this.supportedChipset.equals(motherboard.getChipset());
    }
}

