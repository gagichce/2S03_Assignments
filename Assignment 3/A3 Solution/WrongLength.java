class WrongLength extends Throwable {
    private int len;
    private String name;

    public WrongLength(int len, String name) {
        this.len = len;
        this.name = name;
    }

    public String FormatError() {
        return "Incorrect array size: " + this.len + " (expected 9) at " + this.name ;
    }
}
