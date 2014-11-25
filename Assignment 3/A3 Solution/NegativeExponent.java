package cs2s03;

class NegativeExponent extends Throwable {
    private int exp;
    private String name;

    public NegativeExponent(int exp, String name) {
        this.exp = exp;
        this.name = name;
    }

    public String FormatError() {
        return "Exponent less than zero: " + this.exp + " (expected > 0) at " + this.name ;
    }
}