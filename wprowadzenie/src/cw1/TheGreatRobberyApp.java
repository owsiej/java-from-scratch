package cw1;

public class TheGreatRobberyApp {
    public static void main(String[] args) {

        City city = new City();
        Gang gang = new Gang();
        Police police = new Police();

//        System.out.println(gang);
//        System.out.println(city.getBuildings()[2]);
        gang.letsRob(city.getBuildings());
        System.out.println(gang.getSumRobbedValue());
        police.catchCriminals(gang);
    }

}
