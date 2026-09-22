package assignment04.excercise2;

public enum Gender {
    MALE("Nam"), FEMALE("Nữ") , OTHER("Khác");

    private final String displayGender;

    Gender(String displayGender) {
        this.displayGender = displayGender;
    }

    @Override
    public String toString() {
        return displayGender;
    }
}
