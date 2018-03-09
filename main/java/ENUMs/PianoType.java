package ENUMs;

public enum PianoType {
    GRAND("Grand"),
    ELECTRIC("Electric"),
    VERTICAL("Vertical");

    private final String type;

    PianoType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
