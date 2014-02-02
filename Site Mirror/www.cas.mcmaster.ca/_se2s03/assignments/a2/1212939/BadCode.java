package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 66;
        aa = (11 * x) + (55 - y);
        while (i <= 0) {
            bb = (z * y) - 11;
        }
        i = (y * y) + 66;
        bb = (24 * z) + (x - 55);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 66;
        cc = (58 * y) + (y - x);
        while (i <= 0) {
            aa = z - 24;
        }
        return (aa + bb) + cc;
    }
}

