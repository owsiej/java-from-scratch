package main.modul4.modul4_projekt.computercomponents;

import main.modul4.modul4_projekt.computercomponents.secondaycomps.Hardware;

public class Motherboard extends Hardware {
    private final String processorSocket;
    private final String chipset;
    private final String graphicsCardConnector;
    private final String supportedRAMMemory;
    private final int maxAmountOfRAMMemory;
    private final String sataConnector;
    private final String chargerConnector;
    private final int amountOfUSBPorts;

    public Motherboard(String processorSocket,
                       int maxAmountOfRAMMemory,
                       String supportedRAMMemory,
                       String sataConnectorType,
                       String chipset,
                       int amountOfUSBPorts,
                       String graphicsCardConnector,
                       int warrantyLength,
                       String chargerConnector,
                       double power,
                       String modelName,
                       String typeOfConnector) {
        super(warrantyLength, power, modelName, typeOfConnector);
        this.processorSocket = processorSocket;
        this.maxAmountOfRAMMemory = maxAmountOfRAMMemory;
        this.supportedRAMMemory = supportedRAMMemory;
        this.sataConnector = sataConnectorType;
        this.chipset = chipset;
        this.amountOfUSBPorts = amountOfUSBPorts;
        this.graphicsCardConnector = graphicsCardConnector;
        this.chargerConnector = chargerConnector;
    }

    public String getGraphicsCardConnector() {
        return graphicsCardConnector;
    }

    public String getProcessorSocket() {
        return processorSocket;
    }

    public int getMaxAmountOfRAMMemory() {
        return maxAmountOfRAMMemory;
    }

    public String getSupportedRAMMemory() {
        return supportedRAMMemory;
    }

    public String getSataConnector() {
        return sataConnector;
    }

    public String getChipset() {
        return chipset;
    }

    public int getAmountOfUSBPorts() {
        return amountOfUSBPorts;
    }

    public String getChargerConnector() {
        return chargerConnector;
    }
}

