package apka;

import java.util.*;

public class Party {
//    private - dane pole widoczne jest tylko z poziomu danej klasy czyli tutaj klasy Party
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneToGuest = new HashMap<>();
//public - ta metoda bedzie publiczna aby mozna bylo dodawac gosci z poziomu innej klasy
//    void - typ pusty, czyli nie zwracamy zadnego typu
    Scanner scanner = new Scanner(System.in);

    public void addGuest() {
        System.out.println("Podaj imię gościa, którego chcesz dodać: ");
        String name= scanner.nextLine();

        System.out.println("Podaj preferowany posiłek");
        String meal = scanner.nextLine();

        System.out.println("Podaj nr telefonu gościa");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Podaj czy gośc jest weganinem (Y/N)");
        String isVeganString = scanner.nextLine();

        boolean isVegan =isVeganString.equals("Y");


        Guest guest = new Guest(name, meal, phoneNumber, isVegan);
        guests.add(guest);

        meals.add(meal);
        phoneToGuest.put(phoneNumber, guest);

    }
    public void displayMeals() {
        for (String meal: meals) {
            System.out.println(meal);
        }
    }
    public void displayGuestByPhoneNumber() {
        System.out.println("Podaj nr telefonu");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        phoneToGuest.get(phoneNumber).displayGuestInformation();
    }
    public void displayGuests() {
        for (Guest guest: guests) {
            guest.displayGuestInformation();

        }
    }
}
