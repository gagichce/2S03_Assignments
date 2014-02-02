package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 41;
        aa = (54 * x) + (45 - y);
        while (i <= 0) {
            bb = (z * y) - 54;
        }
        i = (y * y) + 41;
        bb = (26 * z) + (x - 45);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 41;
        cc = (30 * y) + (y - x);
        while (i <= 0) {
            aa = z - 26;
        }
        return (aa + bb) + cc;
    }
}

