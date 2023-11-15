package main.modul4.modul4_projekt.computercomponents.secondaycomps;

public abstract class Hardware {
    protected final double power;
    protected String modelName;
    protected String typeOfConnector;

    protected int warrantyLength;


    public Hardware(int warrantyLength, double power, String modelName, String typeOfConnector) {
        this.warrantyLength = warrantyLength;
        this.power = power;
        this.modelName = modelName;
        this.typeOfConnector = typeOfConnector;
    }

    public double getPower() {
        return power;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWarrantyLength() {
        return warrantyLength;
    }

    public void setWarrantyLength(int warrantyLength) {
        this.warrantyLength = warrantyLength;
    }

    public void performDiagnostics() {
        String name = this.getClass().toString();
        System.out.println(name.substring(name.lastIndexOf(".") + 1) + " is working properly.");
    }


}
