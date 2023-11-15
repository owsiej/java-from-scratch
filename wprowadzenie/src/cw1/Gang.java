package cw1;

import java.util.Arrays;
import java.util.Random;

public class Gang {
    private Criminal[] robAndBobby = new Criminal[2];
    Random rand = new Random();
    private double sumRobbedValue;
    public Gang() {
        Criminal rob = new Criminal("Rob", "Brain", 1990, "planing", new Item[0]);
        Criminal bobby = new Criminal("Bobby", "Silly", 1995, "screwing up", new Item[0]);

        robAndBobby[0]=rob;
        robAndBobby[1]=bobby;
    }

    public double getSumRobbedValue() {
        return sumRobbedValue;
    }

    @Override
    public String toString() {
        return "Gang:\n" +
                "robAndBobby=" + Arrays.toString(robAndBobby);
    }

    public boolean isSuccessful() {
        int randomNumber = rand.nextInt(101);
        int summarizedSuccessChange = robAndBobby.length*Criminal.SUCCESS_PERCENTAGE;

        return randomNumber <= summarizedSuccessChange;

    }
    public void letsRob(Building[] buildings) {
        int buildingIndex = rand.nextInt(buildings.length);

        if (isSuccessful()) {
            System.out.println("The gang managed to rob the following items from the building "+buildings[buildingIndex].getName());
            for (Item item: buildings[buildingIndex].getItems()) {
                sumRobbedValue+=item.getValue();
                System.out.println(item.getName());
            }
        } else {
            System.out.println("The gang tried to rob the"+buildings[buildingIndex].getName()+" but failed.");
        }
    }

}
