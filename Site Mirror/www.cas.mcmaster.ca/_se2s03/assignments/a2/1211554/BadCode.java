package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 16;
        aa = (29 * x) + (28 - y);
        while (i <= 0) {
            bb = (z * y) - 29;
        }
        i = (y * y) + 16;
        bb = (93 * z) + (x - 28);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 16;
        cc = (65 * y) + (y - x);
        while (i <= 0) {
            aa = z - 93;
        }
        return (aa + bb) + cc;
    }
}

