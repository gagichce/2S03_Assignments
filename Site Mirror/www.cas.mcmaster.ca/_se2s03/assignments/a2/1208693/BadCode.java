package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 2;
        aa = (11 * x) + (88 - y);
        while (i <= 0) {
            bb = (z * y) - 11;
        }
        i = (y * y) + 2;
        bb = (2 * z) + (x - 88);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 2;
        cc = (26 * y) + (y - x);
        while (i <= 0) {
            aa = z - 2;
        }
        return (aa + bb) + cc;
    }
}

