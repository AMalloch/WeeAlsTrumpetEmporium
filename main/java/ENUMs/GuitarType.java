package ENUMs;

public enum GuitarType {
    ELECTRIC("Electric"),
    ACOUSTIC("Acoustic"),
    ARCHTOP("Archtop"),
    STEEL("Steel");

    private final String type;

    GuitarType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
