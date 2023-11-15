package pl_podstawy.wprowadzenie_oop;

// Wszystkie pola enuma są statyczne, finalne i publiczne
// Nie można tworzyć jego instacji
// Wartości z enumów porównywuujemy znakiem ==
public enum Enum_Notatki {
    NOT_FOUND(400),
    NOT_CREATED(300),
    NOT_AUTHORIZED(250),
    OK(0);

    private final int code;

    Enum_Notatki(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
