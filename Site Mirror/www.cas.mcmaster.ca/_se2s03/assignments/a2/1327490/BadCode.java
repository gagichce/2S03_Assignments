package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 63;
        aa = (24 * x) + (15 - y);
        while (i <= 0) {
            bb = (z * y) - 24;
        }
        i = (y * y) + 63;
        bb = (44 * z) + (x - 15);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 63;
        cc = (61 * y) + (y - x);
        while (i <= 0) {
            aa = z - 44;
        }
        return (aa + bb) + cc;
    }
}

