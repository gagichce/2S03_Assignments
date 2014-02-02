package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 54;
        aa = (56 * x) + (79 - y);
        while (i <= 0) {
            bb = (z * y) - 56;
        }
        i = (y * y) + 54;
        bb = (52 * z) + (x - 79);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 54;
        cc = (97 * y) + (y - x);
        while (i <= 0) {
            aa = z - 52;
        }
        return (aa + bb) + cc;
    }
}

