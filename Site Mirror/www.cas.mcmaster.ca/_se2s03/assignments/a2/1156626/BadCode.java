package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 82;
        aa = (54 * x) + (61 - y);
        while (i <= 0) {
            bb = (z * y) - 54;
        }
        i = (y * y) + 82;
        bb = (71 * z) + (x - 61);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 82;
        cc = (11 * y) + (y - x);
        while (i <= 0) {
            aa = z - 71;
        }
        return (aa + bb) + cc;
    }
}

