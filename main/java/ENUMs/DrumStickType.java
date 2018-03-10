package ENUMs;

public enum DrumStickType {
    BRUSHES("Brushes"),
    MALLETS("Mallets"),
    FIVEA("5A"),
    SEVEN5("7A"),
    TWOA("2A"),
    TWOB("2B");


    private final String type;

    DrumStickType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
