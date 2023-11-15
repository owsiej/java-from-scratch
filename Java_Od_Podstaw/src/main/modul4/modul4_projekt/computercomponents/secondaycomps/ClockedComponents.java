package main.modul4.modul4_projekt.computercomponents.secondaycomps;

public abstract class ClockedComponents extends Hardware implements Components {
    protected double clocking;

    public ClockedComponents(String typeOfConnector, double power, double clocking, int warrantyLength, String modelName) {
        super(warrantyLength, power, modelName, typeOfConnector);
        this.clocking = clocking;
    }

    public double getClocking() {
        return clocking;
    }


}
