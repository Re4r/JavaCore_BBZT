package oit;

public class Exec111 {
    public static void main(String[] args) {

    }
}

enum WeekDays {
    MONDAY(":)"),
    TUESDAY(":))"),
    WEDNESDAY(":)))"),
    THURSDAY(":))))"),
    FRIDAY(":)))))"),
    SATURDAY(":))))))"),
    SUNDAY(":)))))))");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}
