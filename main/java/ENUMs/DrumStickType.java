package ENUMs;

public enum DrumStickType {
    BRUSHES("Brushes"),
    MALLETS("Mallets");

    private final String type;

    DrumStickType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
