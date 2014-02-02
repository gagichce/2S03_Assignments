package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 14;
        aa = (11 * x) + (35 - y);
        while (i <= 0) {
            bb = (z * y) - 11;
        }
        i = (y * y) + 14;
        bb = (88 * z) + (x - 35);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 14;
        cc = (91 * y) + (y - x);
        while (i <= 0) {
            aa = z - 88;
        }
        return (aa + bb) + cc;
    }
}

