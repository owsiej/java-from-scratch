package cw1;

import java.util.Random;

public class Police {
    private Detective adamPalmer;
    Random rand= new Random();

    public Police() {
        adamPalmer= new Detective("Adam Palmer", "Coyote", 1956, "chess", new Item[0]);
    }

    public boolean areCriminalsCaught() {
        int areCaught = rand.nextInt(101);
        return areCaught<Detective.SUCCESS_PERCENTAGE;
    }

    public boolean catchCriminals(Gang gang) {
        if (areCriminalsCaught()) {
            System.out.println(adamPalmer.getName()+" managed to catch the gang.");
            if (gang.getSumRobbedValue()>0) {
                System.out.println("The stolen items are recovered. Their overall value is estimated to $"+gang.getSumRobbedValue());
            } else {
                System.out.println("The gang couldn't steal anything.");
            }
            return true;
        } else {
            System.out.println(adamPalmer.getName()+" couldn't catch the gang");
            System.out.println("They managed to steal items valued $"+gang.getSumRobbedValue());
        } return false;
    }
}
