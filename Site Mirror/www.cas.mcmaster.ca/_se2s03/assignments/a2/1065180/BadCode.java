package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 55;
        aa = (32 * x) + (54 - y);
        while (i <= 0) {
            bb = (z * y) - 32;
        }
        i = (y * y) + 55;
        bb = (8 * z) + (x - 54);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 55;
        cc = (28 * y) + (y - x);
        while (i <= 0) {
            aa = z - 8;
        }
        return (aa + bb) + cc;
    }
}

