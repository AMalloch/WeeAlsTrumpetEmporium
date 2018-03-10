package ENUMs;

public enum GuitarType {
    ELECTRIC("Electric"),
    ACOUSTIC("Acoustic"),
    ELECTROACOUSTIC("Electro-Acoustic"),
    ARCHTOP("Archtop"),
    STEEL("Steel"),
    DOUBLENECK("Double Neck"),
    BASS("Bass"),
    UPRIGHTBASS("Upright Bass");

    private final String type;

    GuitarType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
