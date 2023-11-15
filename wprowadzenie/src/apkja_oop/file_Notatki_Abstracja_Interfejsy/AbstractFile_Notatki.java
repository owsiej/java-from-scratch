package apkja_oop.file_Notatki_Abstracja_Interfejsy;


/*
 Klasa może dziedziczyć bezpośrednio tylko jedną klasę, w tym klasę abstrakcyjną.

 klasa abstrakcyjna nie musi zaimpletemtować wszystkich metod z interfejsu, jednakże wszystkie te metody muszą być
 docelowo zaimplemetonwane w klasie dziedzicącej nie będącą klasą abstrakcyjną.
 Na tym przykładzie widać, że po drodze klasy AbstractFile oraz AbstractImageFile łącznie dziedziczą z inferfejsu File
 wszystkie metody, co oznacza, że również zwykła klasa JPGImageFile dziedziczy te metody. Gdyby w tych klasach abstrakcyjnych
 była jakakolwiek metoda niezaimplementowana z interfejsu, to trzeba by było zaimplementować ją w klasie JPGImageFile

 W przypadku zadeklarowanej metody abstrakcyjnej to musi być ona zadeklarowana w klasach dziedziczących nieabstrakcyjnych
 Metody abstrakcyjne nie zawierają zaimplementowanego kodu
 */
public abstract class AbstractFile_Notatki implements File_Notatki {
//      protected - widoczne będą w tej klasie jak i klasie dziedziczącej

    protected  String name;
    protected int size;

    protected AbstractFile_Notatki(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
