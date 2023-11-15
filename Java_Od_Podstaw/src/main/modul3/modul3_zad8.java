import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Scratch {
    public static void main(String[] args) {
        List<String> names = List.of("Paweł", "Jacek", "Michał", "Agata", "Marzena", "Kuba", "Paweł", "Agnieszka", "Łukasz", "Wojtek");
        List<String> mutableNames = new ArrayList<>(names);
        List<String> randomizeNames = new ArrayList<>();
        Random random = new Random();

        while(mutableNames.size()!=0) {
            int randomIndex = random.nextInt(0, mutableNames.size());
            randomizeNames.add(mutableNames.get(randomIndex));
            mutableNames.remove(randomIndex);
        }
        System.out.println(randomizeNames);
    }
}