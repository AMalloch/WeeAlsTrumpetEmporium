package ENUMs;

public enum InstrumentType {
    CHORDOPHONE("Chordophone");

    private final String type;

    InstrumentType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
